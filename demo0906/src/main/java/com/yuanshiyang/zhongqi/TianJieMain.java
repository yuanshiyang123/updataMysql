package com.yuanshiyang.zhongqi;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.yuanshiyang.zhongqi.dao.CompanyHolderRep;
import com.yuanshiyang.zhongqi.dao.CompanyRep;
import com.yuanshiyang.zhongqi.dao.CompanyStaffRep;
import com.yuanshiyang.zhongqi.dao.HumanNameRep;
import com.yuanshiyang.zhongqi.pojo.GetCompany;
import com.yuanshiyang.zhongqi.pojo.GetCompanyHolder;
import com.yuanshiyang.zhongqi.pojo.GetCompanyStaff;
import com.yuanshiyang.zhongqi.pojo.GetHumanName;
import com.yuanshiyang.zhongqi.utils.AccessSecretUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Component
public class TianJieMain {
    //     全局参数
    static String url = "https://data.tianyancha.com/dblog.json?";
    static String accessSecret = "bmiqPsB0V4QPNpcW";
    static String _accessKey = "ZsB1Z8Rvxc2NvB5g";
    //    static String table = "human_name";
    static Boolean enableScroll = true;
    //     scrollID生存的时间
    static Integer scrollTimeout = 3600;

    static long _timestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();

    static SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    //    static String startTime = "2020-08-24 21:57:01.911541";
    //    static String startTime = s`.format(new Date());
//    static String endTime = "2020-08-25 00:00:00";
    //    static String endTime = s.format(System.currentTimeMillis()-(1000*60*60*23));
    static String scrollId = "";
    static int ps = 1500;
    static int pn = 1;
    static int total = 0;
    static int reqCounter = 0;


    @Autowired
    private HumanNameRep humanNameRep;

    @Autowired
    private CompanyStaffRep companyStaffRep;

    @Autowired
    private CompanyHolderRep companyHolderRep;

    @Autowired
    private CompanyRep companyRep;

    //    生成时间

    //    封装URL
    public static String URLMethod(long startTime, long endTime, String tableName) throws Exception {
//       时间
//        List times = createDate(startTime, endTime);

        //生成签名
        JSONObject query = new JSONObject();
        query.put("table", tableName);
        query.put("startTime", startTime);
        query.put("endTime", endTime);
        query.put("enableScroll", enableScroll);
        query.put("scrollTimeout", scrollTimeout);
        query.put("ps", ps);
        query.put("pn", pn);

        StrUtil.isNotBlank(url);


        String _sign = AccessSecretUtils.sign(accessSecret, _timestamp, query);

        url += "_accessKey=" + _accessKey
                + "&_sign=" + _sign
                + "&_timestamp=" + _timestamp
                + "&table=" + tableName
                + "&startTime=" + startTime
                + "&endTime=" + endTime
                + "&enableScroll=" + enableScroll
                + "&ps=" + ps
                + "&pn=" + pn
                + "&scrollTimeout=" + scrollTimeout;
        System.out.println(url);
        return url;
    }

    //    封装请求
    public static String doGet(String httpurl) {
        return HttpUtil.get(httpurl);
    }

    //  接口返回结果数据处理
    public static List parseJson(String response, String endTime, String tableName) {
        //将response 转化为 json
        JSONObject json = JSONObject.parseObject(response);
        //判断请求参数是否有问题
        String state = json.getString("state");
        if (!"ok".equals(state)) {
            System.out.println(state);
            System.out.println(json.getString("message"));
            return new ArrayList();
        }
        //第一层中的data 的 items 变为数组
        JSONArray ja_companys = json.getJSONObject("data").getJSONArray("items");

        scrollId = json.getJSONObject("data").getString("scrollId");
        total = json.getJSONObject("data").getInteger("total");
        if (total == 0) {
            System.out.println("这个时间段没有数据！！！");
            return new ArrayList();
        }
        reqCounter = json.getJSONObject("data").getInteger("reqCounter");
        System.out.println("请求次数：" + reqCounter);
        System.out.println("total:" + total);
        //存放最终对象数据
        List list = new ArrayList();
        switch (tableName) {
            case "human_name":
                for (int i = 0; i < ja_companys.size(); i++) {
                    //获取到data 让他变为对象
                    String data = ja_companys.getJSONObject(i).getString("data");
                    //获取data中的字段
                    GetHumanName getHumanName = new Gson().fromJson(data, GetHumanName.class);
                    //将type updateFields batch 放入对象中
                    getHumanName.setOperation_type(ja_companys.getJSONObject(i).getString("type"));
                    getHumanName.setUpdateFields(ja_companys.getJSONObject(i).getString("updateFields"));
                    getHumanName.setBatch(endTime);
                    list.add(getHumanName);
                }
                break;
            case "company_staff":
                for (int i = 0; i < ja_companys.size(); i++) {
                    //获取到data 让他变为对象
                    String data = ja_companys.getJSONObject(i).getString("data");
                    //获取data中的字段
                    GetCompanyStaff getCompanyStaff = new Gson().fromJson(data, GetCompanyStaff.class);
                    //将type updateFields batch 放入对象中
                    getCompanyStaff.setOperation_type(ja_companys.getJSONObject(i).getString("type"));
                    getCompanyStaff.setUpdateFields(ja_companys.getJSONObject(i).getString("updateFields"));
                    getCompanyStaff.setBatch(endTime);
                    list.add(getCompanyStaff);
                }
                break;

            case "company_holder":
                for (int i = 0; i < ja_companys.size(); i++) {
                    //获取到data 让他变为对象
                    String data = ja_companys.getJSONObject(i).getString("data");
                    //获取data中的字段
                    GetCompanyHolder getCompanyHolder = new Gson().fromJson(data, GetCompanyHolder.class);
                    //将type updateFields batch 放入对象中
                    getCompanyHolder.setOperation_type(ja_companys.getJSONObject(i).getString("type"));
                    getCompanyHolder.setUpdateFields(ja_companys.getJSONObject(i).getString("updateFields"));
                    getCompanyHolder.setBatch(endTime);
                    list.add(getCompanyHolder);
                }
                break;

            case "company":
                for (int i = 0; i < ja_companys.size(); i++) {
                    //获取到data 让他变为对象
                    String data = ja_companys.getJSONObject(i).getString("data");
                    //获取data中的字段
                    GetCompany getCompany = new Gson().fromJson(data, GetCompany.class);
                    //将type updateFields batch 放入对象中
                    getCompany.setOperation_type(ja_companys.getJSONObject(i).getString("type"));
                    getCompany.setUpdateFields(ja_companys.getJSONObject(i).getString("updateFields"));
                    getCompany.setBatch(endTime);
                    list.add(getCompany);
                }
                break;
            default:
                System.out.println("表名错误!");
                list.add(new ArrayList<>());
                break;
        }

        return list;
    }

    //    存入数据库
//    public static void storeDatabase(List list) throws Exception {
//
//        String DBUser = null;
//        String DBHost = null;
//        String DBPwd = null;
//        String DBName = null;
//        Integer Port = null;
//        //加载配置文件读取数据库配置
//        Properties pro = new Properties();
//        InputStream is = ZhuanLiDaoImpl.class.getClassLoader().getResourceAsStream("database.properties");
//        Connection con = null;
//        pro.load(is);
//        DBUser = pro.getProperty("DBUser");
//        DBHost = pro.getProperty("DBHost");
//        DBPwd = pro.getProperty("DBPwd");
//        DBName = pro.getProperty("DBName");
//        Port = Integer.parseInt(pro.getProperty("Port"));
//        //建立数据库链接
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        //数据库链接参数
//        con = DriverManager.getConnection("jdbc:mysql://" + DBHost + ":" + Port + "/" + DBName + "?rewriteBatchedStatements=true&serverTimezone=GMT%2B8&useSSL=false", DBUser, DBPwd);
//
//        //将数据写入数据库
//        ZhuanLiDaoImpl zhuanLiDao = new ZhuanLiDaoImpl();
//        if ("human_name".equals(table)) {
//            zhuanLiDao.addHumanName(list, con);
//
//        }
//        if (con != null) {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//                throw new RuntimeException(e);
//            }
//        }
//    }

    //    循环存入数据库
    public static String loop(long startTime, long endTime, String tableName) throws Exception {
        _timestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        String uu = "https://data.tianyancha.com/dblog.json?";
        //生成签名
        JSONObject query = new JSONObject();
        query.put("table", tableName);
        query.put("startTime", startTime);
        query.put("endTime", endTime);
        query.put("scrollId", scrollId);
        query.put("enableScroll", enableScroll);
        query.put("scrollTimeout", scrollTimeout);
        query.put("ps", ps);
        query.put("pn", pn);


        String _sign = AccessSecretUtils.sign(accessSecret, _timestamp, query);

        uu += "_accessKey=" + _accessKey
                + "&_sign=" + _sign
                + "&_timestamp=" + _timestamp
                + "&table=" + tableName
                + "&startTime=" + startTime
                + "&endTime=" + endTime
                + "&scrollId=" + scrollId
                + "&enableScroll=" + enableScroll
                + "&scrollTimeout=" + scrollTimeout
                + "&ps=" + ps
                + "&pn=" + pn;
        return uu;
    }


    public static void main(String[] args) {


    }

    @Scheduled(cron = "0 56 * * * ?")
    public void updata() throws Exception {
        long startTime;
        long endTime;
        int flag;

        ArrayList<Object> tableList = new ArrayList<>();
        tableList.add("human_name");
        tableList.add("company_staff");
        tableList.add("company_holder");
        tableList.add("company");

        for (Object tableName : tableList) {

            LocalDate localDate = LocalDate.now().plusDays(-1);
            LocalDateTime localDateTime = localDate.atTime(0, 0, 0, 0);
            startTime = localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
            System.out.println("startTime = " + localDateTime);
            System.out.println("startTime = " + startTime);
            LocalDate localDate1 = LocalDate.now();
            LocalDateTime localDateTime1 = localDate1.atTime(0, 0, 0, 0);
            endTime = localDateTime1.toInstant(ZoneOffset.of("+8")).toEpochMilli();
            System.out.println("endTime = " + localDateTime1);
            System.out.println("endTime = " + endTime);
            System.out.println("_timestamp = " + _timestamp);

            String s = URLMethod(startTime, endTime, tableName.toString());
            String s1 = doGet(s);
            System.out.println(s1);

            LocalDateTime time2 = LocalDateTime.ofEpochSecond(endTime / 1000, 0, ZoneOffset.ofHours(8));
            //封装返回数据
            List list = parseJson(s1, time2.toString(), tableName.toString());
            //存入数据库
            switch (tableName.toString()) {
                case "human_name":
                    humanNameRep.saveAll(list);
                    flag = (int) Math.ceil(total / ps);
                    //  请求次数<=应该循环次数时循环
                    while (reqCounter <= flag) {
                        System.out.println("需要请求的次数 = " + flag);
                        System.out.println("已经请求的次数 = " + reqCounter);
                        String loop = loop(startTime, endTime, tableName.toString());
                        String response = doGet(loop);
                        List listC = parseJson(response, time2.toString(), tableName.toString());
                        humanNameRep.saveAll(listC);
                    }
                    break;
                case "company_staff":
                    companyStaffRep.saveAll(list);
                    flag = (int) Math.ceil(total / ps);
                    //  请求次数<=应该循环次数时循环
                    while (reqCounter <= flag) {
                        System.out.println("需要请求的次数 = " + flag);
                        System.out.println("已经请求的次数 = " + reqCounter);
                        String loop = loop(startTime, endTime, tableName.toString());
                        String response = doGet(loop);
                        List listC = parseJson(response, time2.toString(), tableName.toString());
                        companyStaffRep.saveAll(listC);
                    }
                    break;
                case "company_holder":
                    companyHolderRep.saveAll(list);
                    flag = (int) Math.ceil(total / ps);
                    //  请求次数<=应该循环次数时循环
                    while (reqCounter <= flag) {
                        System.out.println("需要请求的次数 = " + flag);
                        System.out.println("已经请求的次数 = " + reqCounter);
                        String loop = loop(startTime, endTime, tableName.toString());
                        String response = doGet(loop);
                        List listC = parseJson(response, time2.toString(), tableName.toString());
                        companyHolderRep.saveAll(listC);
                    }
                    break;
                case "company":
                    companyRep.saveAll(list);
                    flag = (int) Math.ceil(total / ps);
                    //  请求次数<=应该循环次数时循环
                    while (reqCounter <= flag) {
                        System.out.println("需要请求的次数 = " + flag);
                        System.out.println("已经请求的次数 = " + reqCounter);
                        String loop = loop(startTime, endTime, tableName.toString());
                        String response = doGet(loop);
                        List listC = parseJson(response, time2.toString(), tableName.toString());
                        companyRep.saveAll(listC);
                    }
                    break;
                default:
                    System.out.println("输入错误!");
                    break;
            }

        }
    }


}
