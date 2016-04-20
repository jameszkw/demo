package com.zkw.builder.demo;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public class ConcreteBuilder implements Builder{

    private Product product = new Product();

    public void buildPart1() {
        product.setPart1("no:9527");
    }

    public void buildPart2() {
        product.setPart2("no:2");
    }

    public Product retrieveResult() {
        return product;
    }
}
