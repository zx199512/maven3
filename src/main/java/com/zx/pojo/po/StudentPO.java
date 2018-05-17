package com.zx.pojo.po;

import java.io.Serializable;

/**
 * Created by  on 2018/5/17.
 */
public class StudentPO implements Serializable {


    private String id;

    private String name;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
