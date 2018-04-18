package com.zkw.clone;

/**
 * Created by Administrator on 2016/9/14 0014.
 */
public class Professor implements Cloneable {
    String name;
    int age;

    Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
