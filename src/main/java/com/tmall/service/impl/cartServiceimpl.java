package com.tmall.service.impl;

import com.tmall.dao.ProductDao;
import com.tmall.dao.UserDao;
import com.tmall.dao.cartDao;
import com.tmall.javaBeans.cart;
import com.tmall.javaBeans.product;
import com.tmall.service.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class cartServiceimpl implements cartService {

    @Autowired
    cartDao dao;
    @Autowired
    ProductDao pro;
    @Autowired
    UserDao use;
    @Override
    public void insertCart(cart c) {
        List<cart> list= dao.findcart(c.getPass());
        for(cart a:list)
        {
            if(a.getProductid()==c.getProductid()&&a.getPass().equals(c.getPass()))
            {
                a.setCount(a.getCount()+1);
                dao.updateCart(a);
                return;
            }
        }
       dao.insertCart(c);
    }
    @Override
    public List<cart> findCart(String s) {
        List<cart> list= dao.findcart(s);
        for(cart a : list)
       {
          product d = pro.findProduct(a.getProductid());
          a.setProduct(d);
       }
        return list;
    }
}
