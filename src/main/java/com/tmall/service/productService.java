package com.tmall.service;

import com.tmall.javaBeans.category;
import com.tmall.javaBeans.product;

import java.util.List;

public interface productService {

    public List<category> getCategory(int str);
    public List<product> getProduct();
}
