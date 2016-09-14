package com.zkw.clonedemo;

/**
 * Created by Administrator on 2016/9/14 0014.
 */
public class Professor0 implements Cloneable {
    String name;
    int age;

    Professor0(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
