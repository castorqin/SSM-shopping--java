package com.tmall.service.impl;

import com.tmall.dao.ProductDao;
import com.tmall.javaBeans.category;
import com.tmall.javaBeans.product;
import com.tmall.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceimpl  implements productService {

   @Autowired
    ProductDao pro;
    @Override
    public List<category> getCategory(int str) {
       List<category> list = pro.getCategory(str);
        System.out.println(list);
        return list;
    }

    @Override
    public List<product> getProduct() {
       List<product> list = pro.getProduct();
       List<category> list1 = pro.getCategory(1);
       for(product a:list)
       {
           List<String> add = pro.getImg(a.getImgid());
           a.setImgaddress(add);
           a.setParentname(pro.getParent(a.getParentid()));
       }
        return list;
    }
}
