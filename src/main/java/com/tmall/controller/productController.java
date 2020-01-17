package com.tmall.controller;

import com.tmall.javaBeans.category;
import com.tmall.javaBeans.product;
import com.tmall.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("productcontroller")
@RequestMapping("/product")
@CrossOrigin
public class productController {

    @Autowired
    productService pro;
    @RequestMapping("/getcate")
    public  @ResponseBody  List<category> getcate( @RequestBody String s){
        int str = Integer.parseInt(s);
        return pro.getCategory(str);
    }
    @RequestMapping("/getproduct")
    public @ResponseBody  List<product> getproduct(){
        List<product> list= pro.getProduct();
        System.out.println(list);
        return list;
    }

}
