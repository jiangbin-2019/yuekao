package com.jiangbin.yuekaoproviderapp.pojo;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    //id
    private String productId;
    //商品名称
    private String productName;
    //商品规格
    private String productHigh;
    //商品数量
    private String productQuantity;
    //商品发货地址
    private String startAddress;
    //商品收货地址
    private String endAddress;
    //商品需要天数
    private Integer wantDay;
    //商品实际天数
    private Integer shiDay;
    //商品描述
    private String remark;

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productHigh='" + productHigh + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                ", startAddress='" + startAddress + '\'' +
                ", endAddress='" + endAddress + '\'' +
                ", wantDay=" + wantDay +
                ", shiDay=" + shiDay +
                ", remark='" + remark + '\'';
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductHigh() {
        return productHigh;
    }

    public void setProductHigh(String productHigh) {
        this.productHigh = productHigh;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public Integer getWantDay() {
        return wantDay;
    }

    public void setWantDay(Integer wantDay) {
        this.wantDay = wantDay;
    }

    public Integer getShiDay() {
        return shiDay;
    }

    public void setShiDay(Integer shiDay) {
        this.shiDay = shiDay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
