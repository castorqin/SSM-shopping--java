package com.tmall.service.impl;

import com.tmall.dao.InfoDao;
import com.tmall.javaBeans.address;
import com.tmall.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InfoServiceimpl implements InfoService {

    @Autowired
    InfoDao dao;
    @Override
    public List<address> getAddress(String pass) {
       return dao.getAddress(pass);
    }

    @Override
    public void creatAddress(address ad) {
        dao.creatAddress(ad);
    }

    @Override
    public void delAddress(address ad) {
        dao.delAddress(ad);
    }

    @Override
    public void updateAddress(address ad) {
        dao.updateAddress(ad);

    }

    @Override
    public void setdefalut(address add) {
        List<address> list = getAddress(add.getPass());
        for(address a:list)
        {
            if(a.getIsdefalut()==1&&add.getAddressID()!=a.getAddressID())
            {
                a.setIsdefalut(0);
                updateAddress(a);
            }
        }
        add.setIsdefalut(1);
        updateAddress(add);
    }
}
