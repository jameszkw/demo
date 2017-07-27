package com.zkw.designpatterns.creational.builder.demo;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public interface Builder {
    public void buildPart1();
    public void buildPart2();
    public Product retrieveResult();

}
