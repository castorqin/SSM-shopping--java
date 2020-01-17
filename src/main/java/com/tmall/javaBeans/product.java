package com.tmall.javaBeans;

import java.io.Serializable;
import java.util.List;

public class product implements Serializable {
    private int id;
    private String creatbypass; //卖家名
    private int parentid;// 父类ID
    private String parentname; //父类名称
    private String subTitle;// 标题
    private double originalPrice; // 原价
    private double nowPrice;//现价
    private int stock;//库存
    private int imgid; // 照片id
    private int commentCount; // 评论数量
    private int saleCount; // 卖出数量
    private List<String> imgaddress;
    public String getParentname() {
        return parentname;
    }
    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public List<String> getImgaddress() {
        return imgaddress;
    }

    public void setImgaddress(List<String> imgaddress) {
        this.imgaddress = imgaddress;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCreatbypass() {
        return creatbypass;
    }

    public void setCreatbypass(String creatbypass) {
        this.creatbypass = creatbypass;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(double nowPrice) {
        this.nowPrice = nowPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", creatbypass='" + creatbypass + '\'' +
                ", parentid=" + parentid +
                ", parentname='" + parentname + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", originalPrice=" + originalPrice +
                ", nowPrice=" + nowPrice +
                ", stock=" + stock +
                ", imgid=" + imgid +
                ", commentCount=" + commentCount +
                ", saleCount=" + saleCount +
                ", imgaddress=" + imgaddress +
                '}';
    }
}
