package com.yuanshiyang.zhongqi.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * @Auther: yuanshiyang
 * @Date: 2020/8/20 18:01
 * @Description:
 */
public class GetHumanName {
    private long id;
    @SerializedName("hid")
    private long hid;
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private int type;
    @SerializedName("create_time")
    private String create_time;
    @SerializedName("update_time")
    private String update_time;
    @SerializedName("deleted")
    private int deleted;
    private String operation_type;
    private String updateFields;
    private String batch;

    public GetHumanName() {
    }

    public GetHumanName(long id, long hid, String name, int type, String create_time, String update_time, int deleted, String operation_type, String updateFields, String batch) {
        this.id = id;
        this.hid = hid;
        this.name = name;
        this.type = type;
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

    public long getHid() {
        return hid;
    }

    public void setHid(long hid) {
        this.hid = hid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        return "GetHumanName{" +
                "id=" + id +
                ", hid=" + hid +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", deleted=" + deleted +
                ", hunman_name_type='" + operation_type + '\'' +
                ", updateFields='" + updateFields + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}
