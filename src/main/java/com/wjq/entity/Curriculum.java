package com.wjq.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Curriculum)实体类
 *
 * @author makejava
 * @since 2019-03-25 17:08:21
 */
public class Curriculum implements Serializable {
    private static final long serialVersionUID = 927036464214830477L;
    //课程id
    private Integer id;
    //课程名称
    private String currname;
    //课程状态
    private String currstatus;
    //课程简介
    private String currprofile;
    //课程编号
    private String currno;
    //课程热度
    private String currheat;
    //关联班级
    private String relationclass;
    //最后操作时间
    private String currlastdate;
    //预留关联id
    private Integer currid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrname() {
        return currname;
    }

    public void setCurrname(String currname) {
        this.currname = currname;
    }

    public String getCurrstatus() {
        return currstatus;
    }

    public void setCurrstatus(String currstatus) {
        this.currstatus = currstatus;
    }

    public String getCurrprofile() {
        return currprofile;
    }

    public void setCurrprofile(String currprofile) {
        this.currprofile = currprofile;
    }

    public String getCurrno() {
        return currno;
    }

    public void setCurrno(String currno) {
        this.currno = currno;
    }

    public String getCurrheat() {
        return currheat;
    }

    public void setCurrheat(String currheat) {
        this.currheat = currheat;
    }

    public String getRelationclass() {
        return relationclass;
    }

    public void setRelationclass(String relationclass) {
        this.relationclass = relationclass;
    }

//    public Date getCurrlastdate() {
//        return currlastdate;
//    }
//
//    public void setCurrlastdate(Date currlastdate) {
//        this.currlastdate = currlastdate;
//    }


    public String getCurrlastdate() {
        return currlastdate;
    }

    public void setCurrlastdate(String currlastdate) {
        this.currlastdate = currlastdate;
    }

    public Integer getCurrid() {
        return currid;
    }

    public void setCurrid(Integer currid) {
        this.currid = currid;
    }

}