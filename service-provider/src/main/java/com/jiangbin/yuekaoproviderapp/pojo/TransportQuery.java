package com.jiangbin.yuekaoproviderapp.pojo;

import java.util.Date;

public class TransportQuery {
    //定义id查询
    private String transportId;
    //查询收货人名称
    private String peopleName;
    //查询收货人手机号
    private String peoplePhone;
    //查询收货日期
    private Date peopleDate;
    //查询收货日期开始
    private Date peoplestartDate;
    //查询收货日期结束
    private Date peopleendDate;
    //查询发货日期
    private Date transportDate;
    //查询发货日期开始
    private Date transportstartDate;
    //查询发货日期结束
    private Date transportendDate;

    private Integer pageNum;
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getPeoplePhone() {
        return peoplePhone;
    }

    public void setPeoplePhone(String peoplePhone) {
        this.peoplePhone = peoplePhone;
    }

    public Date getPeopleDate() {
        return peopleDate;
    }

    public void setPeopleDate(Date peopleDate) {
        this.peopleDate = peopleDate;
    }

    public Date getPeoplestartDate() {
        return peoplestartDate;
    }

    public void setPeoplestartDate(Date peoplestartDate) {
        this.peoplestartDate = peoplestartDate;
    }

    public Date getPeopleendDate() {
        return peopleendDate;
    }

    public void setPeopleendDate(Date peopleendDate) {
        this.peopleendDate = peopleendDate;
    }

    public Date getTransportDate() {
        return transportDate;
    }

    public void setTransportDate(Date transportDate) {
        this.transportDate = transportDate;
    }

    public Date getTransportstartDate() {
        return transportstartDate;
    }

    public void setTransportstartDate(Date transportstartDate) {
        this.transportstartDate = transportstartDate;
    }

    public Date getTransportendDate() {
        return transportendDate;
    }

    public void setTransportendDate(Date transportendDate) {
        this.transportendDate = transportendDate;
    }
}
