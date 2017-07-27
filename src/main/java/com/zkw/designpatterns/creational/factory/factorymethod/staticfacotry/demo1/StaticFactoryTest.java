package com.zkw.designpatterns.creational.factory.factorymethod.staticfacotry.demo1;

/**
 * 【静态工厂方法】
 * 不需要实例化工厂类
 *  如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
 * @author James
 * @create 2017-04-21 下午 5:27
 **/

public class StaticFactoryTest {
    public static void main(String[] args) {
        SendFactory.produceMail().send();
    }
}
