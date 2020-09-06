package com.yuanshiyang.zhongqi.pojo;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "company_holder_test")
public class CompanyHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(columnDefinition = "bigint(20)")
    private long cid;
    @Column(columnDefinition = "bigint(20)")
    private long holder_id;
    @Column(columnDefinition = "int(1)")
    private int holder_type;
    @Column(columnDefinition = "double")
    private double amount;
    @Column(columnDefinition = "varchar(4000)")
    private String capital;
    @Column(columnDefinition = "varchar(4000)")
    private String capital_actual;
    @Column(columnDefinition = "double")
    private double percent;
    @Column(columnDefinition = "int(11)")
    private int source;
    @Column(columnDefinition = "datetime")
    private String create_time;
    @Column(columnDefinition = "datetime")
    private String update_time;
    @Column(columnDefinition = "int(1)")
    private int deleted;
    @Column(columnDefinition = "VARCHAR(20)")
    private String operation_type;
    @Column(columnDefinition = "TEXT")
    private String updateFields;
    @Column(columnDefinition = "DATETIME")
    private String batch;


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
