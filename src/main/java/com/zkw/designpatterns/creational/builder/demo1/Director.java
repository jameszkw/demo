package com.zkw.designpatterns.creational.builder.demo1;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public class Director {
    Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(String toAddress,String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}
