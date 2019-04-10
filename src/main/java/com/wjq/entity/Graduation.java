package com.wjq.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Graduation)实体类
 *
 * @author makejava
 * @since 2019-04-09 14:50:41
 */
public class Graduation implements Serializable {
    private static final long serialVersionUID = 970612980776417153L;
    //主键id  自动递增
    private Integer id;
    //姓名
    private String gname;
    //性别
    private String gsex;
    //年龄
    private String gage;
    //联系方式
    private String gphone;
    //毕业时长
    private String glength;
    //毕业去向
    private String gdetination;
    
    private String glastdate;
    
    private Integer stus;
    
    private Integer oid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGsex() {
        return gsex;
    }

    public void setGsex(String gsex) {
        this.gsex = gsex;
    }

    public String getGphone() {
        return gphone;
    }

    public void setGphone(String gphone) {
        this.gphone = gphone;
    }

    public String getGlength() {
        return glength;
    }

    public void setGlength(String glength) {
        this.glength = glength;
    }

    public String getGdetination() {
        return gdetination;
    }

    public void setGdetination(String gdetination) {
        this.gdetination = gdetination;
    }

    public String getGlastdate() {
        return glastdate;
    }

    public void setGlastdate(String glastdate) {
        this.glastdate = glastdate;
    }

    public Integer getStus() {
        return stus;
    }

    public void setStus(Integer stus) {
        this.stus = stus;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getGage() {
        return gage;
    }

    public void setGage(String gage) {
        this.gage = gage;
    }
}