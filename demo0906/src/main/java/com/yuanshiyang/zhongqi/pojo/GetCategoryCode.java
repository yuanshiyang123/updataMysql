package com.yuanshiyang.zhongqi.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * @Auther: yuanshiyang
 * @Date: 2020/8/26 11:50
 * @Description:
 */
public class GetCategoryCode {
    private int id;
    @SerializedName("category_code")
    private String category_code;
    @SerializedName("cate_third")
    private String cate_third;
    @SerializedName("cate_second")
    private String cate_second;
    @SerializedName("cate_first")
    private String cate_first;
    @SerializedName("create_time")
    private String create_time;
    @SerializedName("update_time")
    private String update_time;
    @SerializedName("deleted")
    private int deleted;

    private String operation_type;
    private String updateFields;
    private String batch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory_code() {
        return category_code;
    }

    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    public String getCate_third() {
        return cate_third;
    }

    public void setCate_third(String cate_third) {
        this.cate_third = cate_third;
    }

    public String getCate_second() {
        return cate_second;
    }

    public void setCate_second(String cate_second) {
        this.cate_second = cate_second;
    }

    public String getCate_first() {
        return cate_first;
    }

    public void setCate_first(String cate_first) {
        this.cate_first = cate_first;
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
