package com.zkw.designpatterns.creational.factory.factorymethod.multifactory.demo1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-21 下午 5:20
 **/

public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
