package com.tmall.javaBeans;

import java.io.Serializable;

public class  address implements Serializable {
   private String name;
   private String region;
   private String address;
   private String post;
   private String phone;
   private String pass;
   private Integer isdefalut;
   private int addressID;
    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getIsdefalut() {
        return isdefalut;
    }

    public void setIsdefalut(Integer isdefalut) {
        this.isdefalut = isdefalut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "address{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                ", post='" + post + '\'' +
                ", phone='" + phone + '\'' +
                ", pass='" + pass + '\'' +
                ", isdefalut=" + isdefalut +
                ", addressID=" + addressID +
                '}';
    }
}
