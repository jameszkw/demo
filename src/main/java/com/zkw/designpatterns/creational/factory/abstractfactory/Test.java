package com.zkw.designpatterns.creational.factory.abstractfactory;

/**
 *  【抽象工厂模式】
 * 如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口,
 * 无需去改动现成的代码。
 * @author James
 * @create 2017-04-21 下午 5:44
 **/

public class Test {
    public static void main(String[] args) {
        SendMailFactory mailFactory = new SendMailFactory();
        mailFactory.produce().send();
    }
}
