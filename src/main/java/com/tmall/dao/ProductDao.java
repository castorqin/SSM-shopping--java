package com.tmall.dao;

import com.tmall.javaBeans.category;
import com.tmall.javaBeans.product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

    @Select("select * from category where deep = #{str}")
    public List<category> getCategory(int str);
    @Select("select name from category where id=#{id}")
    public String getParent(int id);
    @Select("select * from product")
    public List<product> getProduct();
    @Select("select * from product where id = #{i}")
    public product findProduct(int i);
    @Select("select imgaddress from product_img where productid = #{id}")
     public List<String> getImg(int id);

}
