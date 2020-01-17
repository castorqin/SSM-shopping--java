package com.tmall.javaBeans;

import java.io.Serializable;

public class category implements Serializable {
    private int id;
    private String name;
    private  int parentid;
    private int deep;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    @Override
    public String toString() {
        return "category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentid=" + parentid +
                ", deep=" + deep +
                '}';
    }
}
