package com.yuanshiyang.zhongqi.pojo;

import javax.persistence.*;

/**
 * @Auther: yuanshiyang
 * @Date: 2020/8/20 18:01
 * @Description:
 */
@Entity
@Table(name = "human_name_test")
public class HumanName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(columnDefinition = "BIGINT(20)")
    private long hid;
    @Column(columnDefinition = "VARCHAR(120)")
    private String name;
    @Column(columnDefinition = "SMALLINT(6)")
    private int type;
    @Column(columnDefinition = "DATETIME")
    private String create_time;
    @Column(columnDefinition = "DATETIME")
    private String update_time;
    @Column(columnDefinition = "int(1)")
    private int deleted;
    @Column(columnDefinition = "VARCHAR(20)")
    private String operation_type;
    @Column(columnDefinition = "TEXT")
    private String updateFields;
    @Column(columnDefinition = "DATETIME")
    private String batch;


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
