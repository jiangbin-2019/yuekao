package com.jiangbin.yuekaoproviderapp.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transport {
    @Id
    //物流编号
    private String transportId;
    //收货人
    private String peopleName;
    //收货人手机
    private String peoplePhone;
    //收货时间
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date peopleDate;
    //发货时间
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date transportDate;

    @Override
    public String toString() {
        return "Transport{" +
                "transportId='" + transportId + '\'' +
                ", peopleName='" + peopleName + '\'' +
                ", peoplePhone='" + peoplePhone + '\'' +
                ", peopleDate=" + peopleDate +
                ", transportDate=" + transportDate;
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

    public Date getTransportDate() {
        return transportDate;
    }

    public void setTransportDate(Date transportDate) {
        this.transportDate = transportDate;
    }

}
