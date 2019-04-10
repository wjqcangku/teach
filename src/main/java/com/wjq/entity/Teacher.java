package com.wjq.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2019-03-27 10:14:31
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = 505292632987728183L;
    //教师id
    private Integer tid;
    //教师姓名
    private String tname;
    //任职课程
    private String tcurriculum;
    //职龄
    private String tage;
    //教师编号
    private String tno;
    //最后操作时间
    private String tlastdate;
    //教师职称
    private String title;
    //预留关联id
    private Integer tcid;
    //预留关联id
    private Integer tsid;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTcurriculum() {
        return tcurriculum;
    }

    public void setTcurriculum(String tcurriculum) {
        this.tcurriculum = tcurriculum;
    }

    public String getTage() {
        return tage;
    }

    public void setTage(String tage) {
        this.tage = tage;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

//    public Date getTlastdate() {
//        return tlastdate;
//    }
//
//    public void setTlastdate(Date tlastdate) {
//        this.tlastdate = tlastdate;
//    }


    public String getTlastdate() {
        return tlastdate;
    }

    public void setTlastdate(String tlastdate) {
        this.tlastdate = tlastdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public Integer getTsid() {
        return tsid;
    }

    public void setTsid(Integer tsid) {
        this.tsid = tsid;
    }

}