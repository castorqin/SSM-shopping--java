package com.tmall.javaBeans;

import java.io.Serializable;

public class User implements Serializable {
    private  String pass;
    private  String password;
    private  String name;
    private  String phone;
    private  String email;
    private  String headimg;
    private int cartNum;

    public int getCartNum() {
        return cartNum;
    }

    public void setCartNum(int cartNum) {
        this.cartNum = cartNum;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "pass='" + pass + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", headimg='" + headimg + '\'' +
                ", cartNum=" + cartNum +
                '}';
    }
}
