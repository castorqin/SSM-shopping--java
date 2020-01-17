package com.tmall.dao;

import com.tmall.javaBeans.address;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoDao {

    @Select("Select * from address where pass = #{pass}")
    public List<address> getAddress(String pass);
    @Insert("insert into address(pass,name,region,address,post,phone,isdefalut,headimg) " +
            "values(#{pass},#{name},#{region},#{address},#{post},#{phone},#{isdefalut},#{headimg})")
    public void creatAddress(address ad);
    @Update("update address SET pass=#{pass} ,name=#{name},region=#{region},address=#{address}" +
            ",post=#{post},phone=#{phone},isdefalut=#{isdefalut} where addressID=#{addressID}")
    public void updateAddress(address ad);
   @Delete("delete from address where addressID=#{addressID}")
    public void delAddress(address ad);
}
