package com.zkw.designpatterns.creational.builder.demo1;

/**
 * Created by Administrator on 2016/4/20 0020.
 *
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress","fromAddress");

//        AutoMessage msg = builder.r
    }
}
