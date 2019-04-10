package com.wjq.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Studentinfo)实体类
 *
 * @author makejava
 * @since 2019-04-08 15:18:30
 */
public class Studentinfo implements Serializable {
    private static final long serialVersionUID = 940951764270801262L;
    //学生id主键
    private Integer id;
    //学生姓名
    private String sname;
    //学生编号/学号
    private String sno;

    private String ssex;
    //学生编号/学号
    private String sage;
    //所属年级
    //所属年级
    private String stugrade;
    //所属班级
    private String stuclass;
    //生源地
    private String biogenicland;
    //qq联系方式
    private String sqq;
    //手机号码
    private String sphone;
    //学生状态
    private String stustatus;
    //入学日期
    private String sdate;
    //最后操作时间
    private String  slastdate;
    //毕业去向
    private String sdestination;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getStugrade() {
        return stugrade;
    }

    public void setStugrade(String stugrade) {
        this.stugrade = stugrade;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    public String getBiogenicland() {
        return biogenicland;
    }

    public void setBiogenicland(String biogenicland) {
        this.biogenicland = biogenicland;
    }

    public String getSqq() {
        return sqq;
    }

    public void setSqq(String sqq) {
        this.sqq = sqq;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getStustatus() {
        return stustatus;
    }

    public void setStustatus(String stustatus) {
        this.stustatus = stustatus;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getSlastdate() {
        return slastdate;
    }

    public void setSlastdate(String slastdate) {
        this.slastdate = slastdate;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getSdestination() {
        return sdestination;
    }

    public void setSdestination(String sdestination) {
        this.sdestination = sdestination;
    }
}