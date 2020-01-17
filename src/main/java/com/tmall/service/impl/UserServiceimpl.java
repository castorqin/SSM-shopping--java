package com.tmall.service.impl;

import com.tmall.dao.UserDao;
import com.tmall.javaBeans.User;
import com.tmall.javaBeans.responBean;
import com.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
//    @Cacheable(value="sampleCache1", key="'name'+#user.pass")
    public responBean FindUser(User user) {
      List<User> list =  userDao.findUser();
      responBean bean = new responBean();
        System.out.println(list.size());
        for(User a:list)
        {
            if(a.getPassword().equals(user.getPassword())&&a.getPass().equals(user.getPass()))
            {
                bean.setUse(a);
                bean.setStats(1); //登录成功
                return bean;
            }
            if(a.getPhone().equals(user.getPass())&&a.getPassword().equals(user.getPassword())){
                bean.setUse(a);
                bean.setStats(1); //判断手机登录
                System.out.println(a);
                return  bean;
            }
            if(a.getPass().equals(user.getPass())&&!a.getPassword().equals(user.getPassword()))
            {
                bean.setUse(a);
                bean.setStats(-1); //密码错误
                return bean;
            }
        }
        bean.setStats(-2); // 找不到用户
        return  bean;
    }
    @Override
    public int creatUse(User use) {
        List<User> list =  userDao.findUser();
        for(User a:list)
        {
            if(a.getPass().equals(use.getPass()))
            {
                return  0;  //账号已经存在
            }
            if(a.getPhone().equals(use.getPhone()))
            {
                return  3; // 电话已经拥有
            }
        }
        userDao.saveUser(use);
        return  1;
    }
    @Override
    public responBean updateUser(User use) {
        userDao.updateUser(use);
        responBean bean = FindUser(use);
        return bean;
    }
}
