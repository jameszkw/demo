package com.zkw.designpatterns.creational.factory.factorymethod.multifactory.demo1;

/**
 * 【多个工厂方法模式】测试类
 *  如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
 * @author James
 * @create 2017-04-21 下午 5:23
 **/

public class MultiFactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        factory.produceMail().send();
    }
}
