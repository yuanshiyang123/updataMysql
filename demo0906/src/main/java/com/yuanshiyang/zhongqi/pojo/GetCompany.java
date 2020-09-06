package com.yuanshiyang.zhongqi.pojo;
import com.google.gson.annotations.SerializedName;

public class GetCompany {
    private long id;
    @SerializedName("cid")
    private long cid;
    @SerializedName("base")
    private String base;
    @SerializedName("name")
    private String name;
    @SerializedName("name_en")
    private String name_en;
    @SerializedName("name_alias")
    private String name_alias;
    @SerializedName("history_names")
    private String history_names;
    @SerializedName("legal_entity_id")
    private long legal_entity_id;
    @SerializedName("legal_entity_type")
    private int legal_entity_type;
    @SerializedName("reg_number")
    private String reg_number;
    @SerializedName("company_org_type")
    private String company_org_type;
    @SerializedName("reg_location")
    private String reg_location;
    @SerializedName("estiblish_time")
    private String estiblish_time;
    @SerializedName("from_time")
    private String from_time;
    @SerializedName("to_time")
    private String to_time;
    @SerializedName("business_scope")
    private String business_scope;
    @SerializedName("reg_institute")
    private String reg_institute;
    @SerializedName("approved_time")
    private String approved_time;
    @SerializedName("reg_status")
    private String reg_status;
    @SerializedName("reg_capital")
    private String reg_capital;
    @SerializedName("org_number")
    private String org_number;
    @SerializedName("org_approved_institute")
    private String org_approved_institute;
    @SerializedName("current_cid")
    private long current_cid;
    @SerializedName("parent_cid")
    private long parent_cid;
    @SerializedName("company_type")
    private int company_type;
    @SerializedName("credit_code")
    private String credit_code;
    @SerializedName("score")
    private String score;
    @SerializedName("category_code")
    private String category_code;
    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;
    @SerializedName("area_code")
    private int area_code;
    @SerializedName("reg_capital_amount")
    private long reg_capital_amount;
    @SerializedName("reg_capital_currency")
    private String reg_capital_currency;
    @SerializedName("actual_capital_amount")
    private long actual_capital_amount;
    @SerializedName("actual_capital_currency")
    private String actual_capital_currency;
    @SerializedName("reg_status_std")
    private String reg_status_std;
    @SerializedName("social_security_staff_num")
    private int social_security_staff_num;
    @SerializedName("cancel_date")
    private String cancel_date;
    @SerializedName("cancel_reason")
    private String cancel_reason;
    @SerializedName("revoke_date")
    private String revoke_date;
    @SerializedName("revoke_reason")
    private String revoke_reason;
    @SerializedName("emails")
    private String emails;
    @SerializedName("phones")
    private String phones;
    @SerializedName("wechat_public_num")
    private String wechat_public_num;
    @SerializedName("logo")
    private String logo;
    @SerializedName("crawled_time")
    private String crawled_time;
    @SerializedName("create_time")
    private String create_time;
    @SerializedName("update_time")
    private String update_time;
    @SerializedName("deleted")
    private int deleted;
    private String operation_type;
    private String updateFields;
    private String batch;

    public GetCompany() {

    }

    public GetCompany(long id, long cid, String base, String name, String name_en, String name_alias, String history_names, long legal_entity_id, int legal_entity_type, String reg_number, String company_org_type, String reg_location, String estiblish_time, String from_time, String to_time, String business_scope, String reg_institute, String approved_time, String reg_status, String reg_capital, String org_number, String org_approved_institute, long current_cid, long parent_cid, int company_type, String credit_code, String score, String category_code, double lat, double lng, int area_code, long reg_capital_amount, String reg_capital_currency, long actual_capital_amount, String actual_capital_currency, String reg_status_std, int social_security_staff_num, String cancel_date, String cancel_reason, String revoke_date, String revoke_reason, String emails, String phones, String wechat_public_num, String logo, String crawled_time, String create_time, String update_time, int deleted, String operation_type, String updateFields, String batch) {
        this.id = id;
        this.cid = cid;
        this.base = base;
        this.name = name;
        this.name_en = name_en;
        this.name_alias = name_alias;
        this.history_names = history_names;
        this.legal_entity_id = legal_entity_id;
        this.legal_entity_type = legal_entity_type;
        this.reg_number = reg_number;
        this.company_org_type = company_org_type;
        this.reg_location = reg_location;
        this.estiblish_time = estiblish_time;
        this.from_time = from_time;
        this.to_time = to_time;
        this.business_scope = business_scope;
        this.reg_institute = reg_institute;
        this.approved_time = approved_time;
        this.reg_status = reg_status;
        this.reg_capital = reg_capital;
        this.org_number = org_number;
        this.org_approved_institute = org_approved_institute;
        this.current_cid = current_cid;
        this.parent_cid = parent_cid;
        this.company_type = company_type;
        this.credit_code = credit_code;
        this.score = score;
        this.category_code = category_code;
        this.lat = lat;
        this.lng = lng;
        this.area_code = area_code;
        this.reg_capital_amount = reg_capital_amount;
        this.reg_capital_currency = reg_capital_currency;
        this.actual_capital_amount = actual_capital_amount;
        this.actual_capital_currency = actual_capital_currency;
        this.reg_status_std = reg_status_std;
        this.social_security_staff_num = social_security_staff_num;
        this.cancel_date = cancel_date;
        this.cancel_reason = cancel_reason;
        this.revoke_date = revoke_date;
        this.revoke_reason = revoke_reason;
        this.emails = emails;
        this.phones = phones;
        this.wechat_public_num = wechat_public_num;
        this.logo = logo;
        this.crawled_time = crawled_time;
        this.create_time = create_time;
        this.update_time = update_time;
        this.deleted = deleted;
        this.operation_type = operation_type;
        this.updateFields = updateFields;
        this.batch = batch;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getName_alias() {
        return name_alias;
    }

    public void setName_alias(String name_alias) {
        this.name_alias = name_alias;
    }

    public String getHistory_names() {
        return history_names;
    }

    public void setHistory_names(String history_names) {
        this.history_names = history_names;
    }

    public long getLegal_entity_id() {
        return legal_entity_id;
    }

    public void setLegal_entity_id(long legal_entity_id) {
        this.legal_entity_id = legal_entity_id;
    }

    public int getLegal_entity_type() {
        return legal_entity_type;
    }

    public void setLegal_entity_type(int legal_entity_type) {
        this.legal_entity_type = legal_entity_type;
    }

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public String getCompany_org_type() {
        return company_org_type;
    }

    public void setCompany_org_type(String company_org_type) {
        this.company_org_type = company_org_type;
    }

    public String getReg_location() {
        return reg_location;
    }

    public void setReg_location(String reg_location) {
        this.reg_location = reg_location;
    }

    public String getEstiblish_time() {
        return estiblish_time;
    }

    public void setEstiblish_time(String estiblish_time) {
        this.estiblish_time = estiblish_time;
    }

    public String getFrom_time() {
        return from_time;
    }

    public void setFrom_time(String from_time) {
        this.from_time = from_time;
    }

    public String getTo_time() {
        return to_time;
    }

    public void setTo_time(String to_time) {
        this.to_time = to_time;
    }

    public String getBusiness_scope() {
        return business_scope;
    }

    public void setBusiness_scope(String business_scope) {
        this.business_scope = business_scope;
    }

    public String getReg_institute() {
        return reg_institute;
    }

    public void setReg_institute(String reg_institute) {
        this.reg_institute = reg_institute;
    }

    public String getApproved_time() {
        return approved_time;
    }

    public void setApproved_time(String approved_time) {
        this.approved_time = approved_time;
    }

    public String getReg_status() {
        return reg_status;
    }

    public void setReg_status(String reg_status) {
        this.reg_status = reg_status;
    }

    public String getReg_capital() {
        return reg_capital;
    }

    public void setReg_capital(String reg_capital) {
        this.reg_capital = reg_capital;
    }

    public String getOrg_number() {
        return org_number;
    }

    public void setOrg_number(String org_number) {
        this.org_number = org_number;
    }

    public String getOrg_approved_institute() {
        return org_approved_institute;
    }

    public void setOrg_approved_institute(String org_approved_institute) {
        this.org_approved_institute = org_approved_institute;
    }

    public long getCurrent_cid() {
        return current_cid;
    }

    public void setCurrent_cid(long current_cid) {
        this.current_cid = current_cid;
    }

    public long getParent_cid() {
        return parent_cid;
    }

    public void setParent_cid(long parent_cid) {
        this.parent_cid = parent_cid;
    }

    public int getCompany_type() {
        return company_type;
    }

    public void setCompany_type(int company_type) {
        this.company_type = company_type;
    }

    public String getCredit_code() {
        return credit_code;
    }

    public void setCredit_code(String credit_code) {
        this.credit_code = credit_code;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCategory_code() {
        return category_code;
    }

    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getArea_code() {
        return area_code;
    }

    public void setArea_code(int area_code) {
        this.area_code = area_code;
    }

    public long getReg_capital_amount() {
        return reg_capital_amount;
    }

    public void setReg_capital_amount(long reg_capital_amount) {
        this.reg_capital_amount = reg_capital_amount;
    }

    public String getReg_capital_currency() {
        return reg_capital_currency;
    }

    public void setReg_capital_currency(String reg_capital_currency) {
        this.reg_capital_currency = reg_capital_currency;
    }

    public long getActual_capital_amount() {
        return actual_capital_amount;
    }

    public void setActual_capital_amount(long actual_capital_amount) {
        this.actual_capital_amount = actual_capital_amount;
    }

    public String getActual_capital_currency() {
        return actual_capital_currency;
    }

    public void setActual_capital_currency(String actual_capital_currency) {
        this.actual_capital_currency = actual_capital_currency;
    }

    public String getReg_status_std() {
        return reg_status_std;
    }

    public void setReg_status_std(String reg_status_std) {
        this.reg_status_std = reg_status_std;
    }

    public int getSocial_security_staff_num() {
        return social_security_staff_num;
    }

    public void setSocial_security_staff_num(int social_security_staff_num) {
        this.social_security_staff_num = social_security_staff_num;
    }

    public String getCancel_date() {
        return cancel_date;
    }

    public void setCancel_date(String cancel_date) {
        this.cancel_date = cancel_date;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public String getRevoke_date() {
        return revoke_date;
    }

    public void setRevoke_date(String revoke_date) {
        this.revoke_date = revoke_date;
    }

    public String getRevoke_reason() {
        return revoke_reason;
    }

    public void setRevoke_reason(String revoke_reason) {
        this.revoke_reason = revoke_reason;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getWechat_public_num() {
        return wechat_public_num;
    }

    public void setWechat_public_num(String wechat_public_num) {
        this.wechat_public_num = wechat_public_num;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCrawled_time() {
        return crawled_time;
    }

    public void setCrawled_time(String crawled_time) {
        this.crawled_time = crawled_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public String getUpdateFields() {
        return updateFields;
    }

    public void setUpdateFields(String updateFields) {
        this.updateFields = updateFields;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "GetCompany{" +
                "id=" + id +
                ", cid=" + cid +
                ", base='" + base + '\'' +
                ", name='" + name + '\'' +
                ", name_en='" + name_en + '\'' +
                ", name_alias='" + name_alias + '\'' +
                ", history_names='" + history_names + '\'' +
                ", legal_entity_id=" + legal_entity_id +
                ", legal_entity_type=" + legal_entity_type +
                ", reg_number='" + reg_number + '\'' +
                ", company_org_type='" + company_org_type + '\'' +
                ", reg_location='" + reg_location + '\'' +
                ", estiblish_time='" + estiblish_time + '\'' +
                ", from_time='" + from_time + '\'' +
                ", to_time='" + to_time + '\'' +
                ", business_scope='" + business_scope + '\'' +
                ", reg_institute='" + reg_institute + '\'' +
                ", approved_time='" + approved_time + '\'' +
                ", reg_status='" + reg_status + '\'' +
                ", reg_capital='" + reg_capital + '\'' +
                ", org_number='" + org_number + '\'' +
                ", org_approved_institute='" + org_approved_institute + '\'' +
                ", current_cid=" + current_cid +
                ", parent_cid=" + parent_cid +
                ", company_type=" + company_type +
                ", credit_code='" + credit_code + '\'' +
                ", score='" + score + '\'' +
                ", category_code='" + category_code + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", area_code=" + area_code +
                ", reg_capital_amount=" + reg_capital_amount +
                ", reg_capital_currency='" + reg_capital_currency + '\'' +
                ", actual_capital_amount=" + actual_capital_amount +
                ", actual_capital_currency='" + actual_capital_currency + '\'' +
                ", reg_status_std='" + reg_status_std + '\'' +
                ", social_security_staff_num=" + social_security_staff_num +
                ", cancel_date='" + cancel_date + '\'' +
                ", cancel_reason='" + cancel_reason + '\'' +
                ", revoke_date='" + revoke_date + '\'' +
                ", revoke_reason='" + revoke_reason + '\'' +
                ", emails='" + emails + '\'' +
                ", phones='" + phones + '\'' +
                ", wechat_public_num='" + wechat_public_num + '\'' +
                ", logo='" + logo + '\'' +
                ", crawled_time='" + crawled_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", deleted=" + deleted +
                ", type='" + operation_type + '\'' +
                ", updateFields='" + updateFields + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}