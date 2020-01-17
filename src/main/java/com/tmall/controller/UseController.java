package com.tmall.controller;

import com.aliyuncs.exceptions.ClientException;
import com.tmall.javaBeans.User;
import com.tmall.javaBeans.responBean;
import com.tmall.service.UserService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller("accountController")
@RequestMapping("/USER")
@CrossOrigin
public class UseController {
    @Autowired
    private UserService user;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody responBean login(@RequestBody (required=false) User use ) {
        responBean bean ;
         bean  = user.FindUser(use);
        System.out.println(bean);
       return bean;
    }
    @RequestMapping(value = "regist",method = RequestMethod.POST)
    public @ResponseBody responBean regist(@RequestBody (required=false) User use ) {

        int x = user.creatUse(use);
        responBean bean = new responBean();
        System.out.println(x);
        bean.setStats(x);
        System.out.println(x);
            return  bean;
    }
    @RequestMapping(value = "registbyphone",method = RequestMethod.POST)
    public @ResponseBody String regist(@RequestBody (required=false) String phone )  {
        String  code = null;
        String str = phone.substring(1,12);
        try{
            code = com.tmall.util.AliyunSmsUtils.send(str);
        }catch (Exception e){

        }
        return  code;
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public @ResponseBody responBean update(@RequestBody (required=false) User use ){
        System.out.println(use);
        responBean bean = user.updateUser(use);
        return  bean;
    }
    @RequestMapping(value = "updateimg",method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "imgfile", required = false) MultipartFile file) throws IOException {

        String fileName = file.getOriginalFilename();//获取文件名
        String path = "D:/pic";
        String prefixName= FilenameUtils.getExtension(fileName);
        if(prefixName.equalsIgnoreCase("jpg")||prefixName.equalsIgnoreCase("png")||
                prefixName.equalsIgnoreCase("jpeg")||prefixName.equalsIgnoreCase("pneg"))
        {
            String filename = UUID.randomUUID().toString().replaceAll("-", "")+"."+ prefixName;
            File targetFile= new File(path,filename);
            String respon = "http://localhost:8088/pic/";
            try {
                if(!targetFile.exists()){
                    //写入文件
                    file.transferTo(targetFile);
                }
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件名" + filename);
              return  respon+filename;
        }
       return "1";
//        /**
//         * 如果文件夹不存在，自动创建该文件夹
//         */
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        //MultipartFile自带的解析方法
//        if (!file.isEmpty()) {
//            file.transferTo(dir);
//            return path2 + '\\' + fileName;
//        } else {
//            System.out.println("空文件");
//            return "不允许上传空文件";
//        }

    }
}
