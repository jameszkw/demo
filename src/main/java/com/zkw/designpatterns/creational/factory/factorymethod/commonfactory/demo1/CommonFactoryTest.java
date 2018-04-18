package com.zkw.designpatterns.creational.factory.factorymethod.commonfactory.demo1;

/**
 * 【普通工厂模式】测试类
 *  如果传入的字符串有误，不能正确创建对象
 *  如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
 * @author James
 * @create 2017-04-21 下午 5:17
 **/

public class CommonFactoryTest {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}
