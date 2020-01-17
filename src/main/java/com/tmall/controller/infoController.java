package com.tmall.controller;

import com.tmall.javaBeans.address;
import com.tmall.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("infocontroller")
@RequestMapping("/Info")
@CrossOrigin
public class infoController {

     @Autowired
    private InfoService info;
     @RequestMapping("/getaddress")
    public @ResponseBody List<address> getAddress( @RequestBody String str)
    {
        System.out.println(str);
        List<address> list = info.getAddress(str);
        System.out.println(list);
        return list;
    }

    @RequestMapping("/modifyinfo")
    public @ResponseBody int modify( @RequestBody address add)
    {

           add.setIsdefalut(0);
         System.out.println(add);
           info.creatAddress(add);
           return  1;
    }
    @RequestMapping("/delAddress")
    public @ResponseBody int del( @RequestBody address add)
    {

       info.delAddress(add);
       return 1;
    }
    @RequestMapping("/updateaddress")
    public @ResponseBody int update( @RequestBody address add)
    {

          info.updateAddress(add);
        return 1;
    }
    @RequestMapping("/setDeaflut")
    public @ResponseBody int setdefalut( @RequestBody address add)
    {
         info.setdefalut(add);
          return 1;
    }

}
