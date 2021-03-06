package com.yuanshiyang.zhongqi.pojo;

import javax.persistence.*;

@Entity
@Table(name = "company_test")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long cid;
    @Column
    private String base;
    @Column
    private String name;
    @Column
    private String name_en;
    @Column
    private String name_alias;
    @Column
    private String history_names;
    @Column
    private long legal_entity_id;
    @Column
    private int legal_entity_type;
    @Column
    private String reg_number;
    @Column
    private String company_org_type;
    @Column
    private String reg_location;
    @Column
    private String estiblish_time;
    @Column
    private String from_time;
    @Column
    private String to_time;
    @Column
    private String business_scope;
    @Column
    private String reg_institute;
    @Column
    private String approved_time;
    @Column
    private String reg_status;
    @Column
    private String reg_capital;
    @Column
    private String org_number;
    @Column
    private String org_approved_institute;
    @Column
    private long current_cid;
    @Column
    private long parent_cid;
    @Column
    private int company_type;
    @Column
    private String credit_code;
    @Column
    private String score;
    @Column
    private String category_code;
    @Column
    private double lat;
    @Column
    private double lng;
    @Column
    private int area_code;
    @Column
    private long reg_capital_amount;
    @Column
    private String reg_capital_currency;
    @Column
    private long actual_capital_amount;
    @Column
    private String actual_capital_currency;
    @Column
    private String reg_status_std;
    @Column
    private int social_security_staff_num;
    @Column
    private String cancel_date;
    @Column
    private String cancel_reason;
    @Column
    private String revoke_date;
    @Column
    private String revoke_reason;
    @Column
    private String emails;
    @Column
    private String phones;
    @Column
    private String wechat_public_num;
    @Column
    private String logo;
    @Column
    private String crawled_time;
    @Column
    private String create_time;
    @Column
    private String update_time;
    @Column
    private int deleted;
    @Column
    private String operation_type;
    @Column
    private String updateFields;
    @Column
    private String batch;

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
}