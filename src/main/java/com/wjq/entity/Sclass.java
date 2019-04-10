package com.wjq.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Sclass)实体类
 *
 * @author makejava
 * @since 2019-03-25 17:06:00
 */
public class Sclass implements Serializable {
    private static final long serialVersionUID = 441350529505612561L;
    //班级id 主键
    private Integer scid;
    //所属院系
    private String sccollege;
    //班级名称
    private String scname;
    //班级编号
    private String scno;
    //班级人数
    private String scpeople;
    //班级简介
    private String scprofile;
    //最后修改时间
    private String  sclastdate;
    //关联学生的id
    private String sid;


    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public String getSccollege() {
        return sccollege;
    }

    public void setSccollege(String sccollege) {
        this.sccollege = sccollege;
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    public String getScno() {
        return scno;
    }

    public void setScno(String scno) {
        this.scno = scno;
    }

    public String getScpeople() {
        return scpeople;
    }

    public void setScpeople(String scpeople) {
        this.scpeople = scpeople;
    }

    public String getScprofile() {
        return scprofile;
    }

    public void setScprofile(String scprofile) {
        this.scprofile = scprofile;
    }


    public String getSclastdate() {
        return sclastdate;
    }

    public void setSclastdate(String sclastdate) {
        this.sclastdate = sclastdate;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Sclass{" +
                "scid=" + scid +
                ", sccollege='" + sccollege + '\'' +
                ", scname='" + scname + '\'' +
                ", scno='" + scno + '\'' +
                ", scpeople='" + scpeople + '\'' +
                ", scprofile='" + scprofile + '\'' +
                ", sclastdate='" + sclastdate + '\'' +
                ", sid='" + sid + '\'' +
                '}';
    }
}