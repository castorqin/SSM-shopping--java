package com.tmall.javaBeans;

import java.io.Serializable;
import java.util.List;

public class cart implements Serializable {
    private  int id;
    private String pass;
    private  int productid;
    private int count;
    private product Product;
    public product getProduct() {
        return Product;
    }

    public void setProduct(product product) {
        Product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "cart{" +
                "id=" + id +
                ", pass='" + pass + '\'' +
                ", productid=" + productid +
                ", count=" + count +
                ", Product=" + Product +
                '}';
    }
}
