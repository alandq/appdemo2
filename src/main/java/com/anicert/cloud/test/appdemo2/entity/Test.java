package com.anicert.cloud.test.appdemo2.entity;

import java.io.Serializable;

/*
Test实体类
 */
public class Test implements Serializable {
    // id
    private Integer id;
    // string
    private String string;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
