package com.yuanshiyang.zhongqi.pojo;

import javax.persistence.*;

@Entity
@Table(name = "company_staff")
public class CompanyStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(columnDefinition = "bigint(20)")
    private long cid;
    @Column(columnDefinition = "bigint(255)")
    private long hid;
    @Column(columnDefinition = "varchar(255)")
    private String staff_type;
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
