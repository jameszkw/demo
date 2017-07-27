package com.zkw.designpatterns.creational.builder.demo;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();

        Product product = builder.retrieveResult();
        System.out.printf(product.getPart1());

    }
}
