package com.zkw.catchDemo;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-08-30 下午 8:35
 **/

public class Account {
    private int id;
    private String name;

    public Account(String name) {
        this.name = name;
    }
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
}
