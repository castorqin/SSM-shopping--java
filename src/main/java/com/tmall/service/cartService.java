package com.tmall.service;

import com.tmall.javaBeans.cart;
import com.tmall.javaBeans.product;

import java.util.List;

public interface cartService {

    public void insertCart(cart c);
    public List<cart> findCart(String s);
}
