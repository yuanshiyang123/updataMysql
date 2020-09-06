package com.yuanshiyang.zhongqi.dao;


import com.yuanshiyang.zhongqi.pojo.GetCompany;
import com.yuanshiyang.zhongqi.pojo.GetCompanyHolder;
import com.yuanshiyang.zhongqi.pojo.GetCompanyStaff;
import com.yuanshiyang.zhongqi.pojo.GetHumanName;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ZhuanLiDaoImpl {

    public void addCompany(List<GetCompany> infoList, Connection con) {

        PreparedStatement pstm = null;

        try {
            String sql = "INSERT INTO company_test VALUES ( NULL,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?)";
            //执行sql语句
            pstm = con.prepareStatement(sql);
            con.setAutoCommit(false);//控制手动提交事务
            Long startTime = System.currentTimeMillis();//开始时间
            if (infoList != null) {
                for (int i = 0; i < infoList.size(); i++) {
                    GetCompany lfInfo = infoList.get(i);
                    pstm.setLong(1, lfInfo.getCid());
                    pstm.setString(2, lfInfo.getBase());
                    pstm.setString(3, lfInfo.getName());
                    pstm.setString(4, lfInfo.getName_en());
                    pstm.setString(5, lfInfo.getName_alias());
                    pstm.setString(6, lfInfo.getHistory_names());
                    pstm.setLong(7, lfInfo.getLegal_entity_id());
                    pstm.setInt(8, lfInfo.getLegal_entity_type());
                    pstm.setString(9, lfInfo.getReg_number());
                    pstm.setString(10, lfInfo.getCompany_org_type());
                    pstm.setString(11, lfInfo.getReg_location());
                    pstm.setString(12, lfInfo.getEstiblish_time());
                    pstm.setString(13, lfInfo.getFrom_time());
                    pstm.setString(14, lfInfo.getTo_time());
                    pstm.setString(15, lfInfo.getBusiness_scope());
                    pstm.setString(16, lfInfo.getReg_institute());
                    pstm.setString(17, lfInfo.getApproved_time());
                    pstm.setString(18, lfInfo.getReg_status());
                    pstm.setString(19, lfInfo.getReg_capital());
                    pstm.setString(20, lfInfo.getOrg_number());
                    pstm.setString(21, lfInfo.getOrg_approved_institute());
                    pstm.setLong(22, lfInfo.getCurrent_cid());
                    pstm.setLong(23, lfInfo.getParent_cid());
                    pstm.setInt(24, lfInfo.getCompany_type());
                    pstm.setString(25, lfInfo.getCredit_code());
                    pstm.setString(26, lfInfo.getScore());
                    pstm.setString(27, lfInfo.getCategory_code());
                    pstm.setDouble(28, lfInfo.getLat());
                    pstm.setDouble(29, lfInfo.getLng());
                    pstm.setInt(30, lfInfo.getArea_code());
                    pstm.setLong(31, lfInfo.getReg_capital_amount());
                    pstm.setString(32, lfInfo.getReg_capital_currency());
                    pstm.setLong(33, lfInfo.getActual_capital_amount());
                    pstm.setString(34, lfInfo.getActual_capital_currency());
                    pstm.setString(35, lfInfo.getReg_status_std());
                    pstm.setInt(36, lfInfo.getSocial_security_staff_num());
                    pstm.setString(37, lfInfo.getCancel_date());
                    pstm.setString(38, lfInfo.getCancel_reason());
                    pstm.setString(39, lfInfo.getRevoke_date());
                    pstm.setString(40, lfInfo.getRevoke_reason());
                    pstm.setString(41, lfInfo.getEmails());
                    pstm.setString(42, lfInfo.getPhones());
                    pstm.setString(43, lfInfo.getWechat_public_num());
                    pstm.setString(44, lfInfo.getLogo());
                    pstm.setString(45, lfInfo.getCrawled_time());
                    pstm.setString(46, lfInfo.getCreate_time());
                    pstm.setString(47, lfInfo.getUpdate_time());
                    pstm.setInt(48, lfInfo.getDeleted());
                    pstm.setString(49, lfInfo.getOperation_type());
                    pstm.setString(50, lfInfo.getUpdateFields());
                    pstm.setString(51, lfInfo.getBatch());
                    pstm.addBatch();
                    // 500条记录插入一次
                    if (i % 10000 == 0) {
                        pstm.executeBatch();
                        con.commit();//提交事务
                        pstm.clearBatch();
                    }
                }
            }
            pstm.executeBatch();
            con.commit();//提交事务
            pstm.clearBatch();
            Long endTime = System.currentTimeMillis();//结束时间
            System.out.println("数据插入用时：" + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public void addCompanyHolder(List<GetCompanyHolder> infoList, Connection con) {

        PreparedStatement pstm = null;

        try {
            String sql = "INSERT INTO company_holder_test VALUES ( NULL,?,?,?,?" +
                    ",?,?,?,?,?" +
                    ",?,?,?,?,?)";
            //执行sql语句
            pstm = con.prepareStatement(sql);
            con.setAutoCommit(false);//控制手动提交事务
            Long startTime = System.currentTimeMillis();//开始时间
            if (infoList != null) {
                for (int i = 0; i < infoList.size(); i++) {
                    GetCompanyHolder lfInfo = infoList.get(i);
                    pstm.setLong(1, lfInfo.getCid());
                    pstm.setLong(2, lfInfo.getHolder_id());
                    pstm.setDouble(3, lfInfo.getHolder_type());
                    pstm.setDouble(4, lfInfo.getAmount());
                    pstm.setString(5, lfInfo.getCapital());
                    pstm.setString(6, lfInfo.getCapital_actual());
                    pstm.setDouble(7, lfInfo.getPercent());
                    pstm.setInt(8, lfInfo.getSource());
                    pstm.setString(9, lfInfo.getCreate_time());
                    pstm.setString(10, lfInfo.getUpdate_time());
                    pstm.setInt(11, lfInfo.getDeleted());
                    pstm.setString(12, lfInfo.getOperation_type());
                    pstm.setString(13, lfInfo.getUpdateFields());
                    pstm.setString(14, lfInfo.getBatch());
                    pstm.addBatch();
                    // 500条记录插入一次
                    if (i % 500 == 0) {
                        pstm.executeBatch();
                        con.commit();//提交事务
                        pstm.clearBatch();
                    }
                }
            }
            pstm.executeBatch();
            con.commit();//提交事务
            pstm.clearBatch();
            Long endTime = System.currentTimeMillis();//结束时间
            System.out.println("数据插入用时：" + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public void addCompanyStaff(List<GetCompanyStaff> infoList, Connection con) {

        PreparedStatement pstm = null;

        try {
            String sql = "INSERT INTO company_staff_test VALUES ( NULL,?,?,?,?" +
                    ",?,?,?,?,?)";
            //执行sql语句
            pstm = con.prepareStatement(sql);
            con.setAutoCommit(false);//控制手动提交事务
            Long startTime = System.currentTimeMillis();//开始时间
            if (infoList != null) {
                for (int i = 0; i < infoList.size(); i++) {
                    GetCompanyStaff lfInfo = infoList.get(i);
                    pstm.setLong(1, lfInfo.getCid());
                    pstm.setLong(2, lfInfo.getHid());
                    pstm.setString(3, lfInfo.getStaff_type());
                    pstm.setString(4, lfInfo.getCreate_time());
                    pstm.setString(5, lfInfo.getUpdate_time());
                    pstm.setInt(6, lfInfo.getDeleted());
                    pstm.setString(7, lfInfo.getOperation_type());
                    pstm.setString(8, lfInfo.getUpdateFields());
                    pstm.setString(9, lfInfo.getBatch());
                    pstm.addBatch();
                    // 500条记录插入一次
                    if (i % 500 == 0) {
                        pstm.executeBatch();
                        con.commit();//提交事务
                        pstm.clearBatch();
                    }
                }
            }
            pstm.executeBatch();
            con.commit();//提交事务
            pstm.clearBatch();
            Long endTime = System.currentTimeMillis();//结束时间
            System.out.println("数据插入用时：" + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public void addHumanName(List<GetHumanName> infoList, Connection con) {

        PreparedStatement pstm = null;

        try {
            String sql = "INSERT INTO human_name_test VALUES ( NULL,?,?,?,?" +
                    ",?,?,?,?,?)";
            //执行sql语句
            pstm = con.prepareStatement(sql);
            con.setAutoCommit(false);//控制手动提交事务
            Long startTime = System.currentTimeMillis();//开始时间
            if (infoList != null) {
                for (int i = 0; i < infoList.size(); i++) {
                    GetHumanName lfInfo = infoList.get(i);
                    pstm.setLong(1, lfInfo.getHid());
                    pstm.setString(2, lfInfo.getName());
                    pstm.setInt(3, lfInfo.getType());
                    pstm.setString(4, lfInfo.getCreate_time());
                    pstm.setString(5, lfInfo.getUpdate_time());
                    pstm.setInt(6, lfInfo.getDeleted());
                    pstm.setString(7, lfInfo.getOperation_type());
                    pstm.setString(8, lfInfo.getUpdateFields());
                    pstm.setString(9, lfInfo.getBatch());
                    pstm.addBatch();
                    // 500条记录插入一次
                    if (i % 500 == 0) {
                        pstm.executeBatch();
                        con.commit();//提交事务
                        pstm.clearBatch();
                    }
                }
            }
            pstm.executeBatch();
            con.commit();//提交事务
            pstm.clearBatch();
            Long endTime = System.currentTimeMillis();//结束时间
            System.out.println("数据插入用时：" + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }



}
