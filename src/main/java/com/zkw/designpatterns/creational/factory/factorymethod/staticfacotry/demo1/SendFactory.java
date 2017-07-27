package com.zkw.designpatterns.creational.factory.factorymethod.staticfacotry.demo1;

/**
 * 静态工厂方法
 *
 * @author James
 * @create 2017-04-21 下午 5:25
 **/

public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
