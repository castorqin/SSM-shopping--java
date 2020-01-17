package com.tmall.dao;

import com.tmall.javaBeans.User;
import com.tmall.javaBeans.cart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Insert("insert into user(pass,password,name,phone) values(#{pass},#{password},#{name},#{phone})")
    public void saveUser(User user);
    @Select("select * from user")
    public List<User> findUser();
    @Update("update user set name=#{name},phone=#{phone},email=#{email},headimg=#{headimg} where pass =#{pass}")
    public void updateUser(User use);
    @Update("update user set cartNum=#{cartNum} where pass=#{pass}")
    public void updateCart(User user);
}
