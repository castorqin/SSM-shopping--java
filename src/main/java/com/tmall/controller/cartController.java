package com.tmall.controller;

import com.tmall.javaBeans.cart;
import com.tmall.service.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("cartcontroller")
@RequestMapping("/Cart")
@CrossOrigin
public class cartController {
    @Autowired
    cartService cart;
    @RequestMapping("/getCart")
    public @ResponseBody List<cart> getcart(@RequestBody String pass){
        List<cart> list = cart.findCart(pass);
        System.out.println(list);
        return list;
    }
    @RequestMapping("/insert")
    public @ResponseBody void insertCart(@RequestBody cart ca){
        cart.insertCart(ca);
        System.out.println(ca);
    }
}
