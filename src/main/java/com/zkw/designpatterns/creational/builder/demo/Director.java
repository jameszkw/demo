package com.zkw.designpatterns.creational.builder.demo;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
