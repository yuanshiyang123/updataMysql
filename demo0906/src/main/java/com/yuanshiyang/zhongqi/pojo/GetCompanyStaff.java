package com.yuanshiyang.zhongqi.pojo;

import com.google.gson.annotations.SerializedName;

public class GetCompanyStaff {
    @SerializedName("cid")
    private long cid;
    @SerializedName("hid")
    private long hid;
    @SerializedName("staff_type")
    private String staff_type;
    @SerializedName("create_time")
    private String create_time;
    @SerializedName("update_time")
    private String update_time;
    @SerializedName("deleted")
    private int deleted;
    private String operation_type;
    private String updateFields;
    private String batch;

    public GetCompanyStaff(long cid, long hid, String staff_type, String create_time, String update_time, int deleted, String operation_type, String updateFields, String batch) {
        this.cid = cid;
        this.hid = hid;
        this.staff_type = staff_type;
        this.create_time = create_time;
        this.update_time = update_time;
        this.deleted = deleted;
        this.operation_type = operation_type;
        this.updateFields = updateFields;
        this.batch = batch;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public long getHid() {
        return hid;
    }

    public void setHid(long hid) {
        this.hid = hid;
    }

    public String getStaff_type() {
        return staff_type;
    }

    public void setStaff_type(String staff_type) {
        this.staff_type = staff_type;
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
        return "GetCompanyStaff{" +
                "cid=" + cid +
                ", hid=" + hid +
                ", staff_type='" + staff_type + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", deleted=" + deleted +
                ", type='" + operation_type + '\'' +
                ", updateFields='" + updateFields + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}
