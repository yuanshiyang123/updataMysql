package com.yuanshiyang.zhongqi.pojo;

import com.google.gson.annotations.SerializedName;

public class GetCompanyHolder {
    @SerializedName("cid")
    private long cid;
    @SerializedName("holder_id")
    private long holder_id;
    @SerializedName("holder_type")
    private int holder_type;
    @SerializedName("amount")
    private double amount;
    @SerializedName("capital")
    private String capital;
    @SerializedName("capital_actual")
    private String capital_actual;
    @SerializedName("percent")
    private double percent;
    @SerializedName("source")
    private int source;
    @SerializedName("create_time")
    private String create_time;
    @SerializedName("update_time")
    private String update_time;
    @SerializedName("deleted")
    private int deleted;
    private String operation_type;
    private String updateFields;
    private String batch;

    public GetCompanyHolder(long cid, long holder_id, int holder_type, double amount, String capital, String capital_actual, double percent, int source, String create_time, String update_time, int deleted, String operation_type, String updateFields, String batch) {
        this.cid = cid;
        this.holder_id = holder_id;
        this.holder_type = holder_type;
        this.amount = amount;
        this.capital = capital;
        this.capital_actual = capital_actual;
        this.percent = percent;
        this.source = source;
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

    public long getHolder_id() {
        return holder_id;
    }

    public void setHolder_id(long holder_id) {
        this.holder_id = holder_id;
    }

    public int getHolder_type() {
        return holder_type;
    }

    public void setHolder_type(int holder_type) {
        this.holder_type = holder_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital_actual() {
        return capital_actual;
    }

    public void setCapital_actual(String capital_actual) {
        this.capital_actual = capital_actual;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
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
        return "GetCompanyHolder{" +
                "cid=" + cid +
                ", holder_id=" + holder_id +
                ", holder_type=" + holder_type +
                ", amount=" + amount +
                ", capital='" + capital + '\'' +
                ", capital_actual='" + capital_actual + '\'' +
                ", percent=" + percent +
                ", source=" + source +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", deleted=" + deleted +
                ", type='" + operation_type + '\'' +
                ", updateFields='" + updateFields + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}
