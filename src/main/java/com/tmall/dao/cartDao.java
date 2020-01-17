package com.tmall.dao;

import com.tmall.javaBeans.cart;
import com.tmall.javaBeans.product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface cartDao {
    @Insert("insert into cart(id,pass,productid,count) " +
            "values(#{id},#{pass},#{productid},#{count})")
    public void insertCart(cart c);
    @Update("update cart SET count=#{count} where pass=#{pass} and productid = #{productid}")
    public void updateCart(cart c);
    @Select("select * from cart where pass = #{pass}")
    public List<cart> findcart(String pass);
}
