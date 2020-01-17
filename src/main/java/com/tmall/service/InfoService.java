package com.tmall.service;

import com.tmall.javaBeans.address;

import java.util.List;

public interface InfoService {
    public List<address> getAddress(String pass);
    public void creatAddress(address ad);
    public void delAddress(address ad);
    public void updateAddress(address ad);
    public  void setdefalut(address ad);
}
