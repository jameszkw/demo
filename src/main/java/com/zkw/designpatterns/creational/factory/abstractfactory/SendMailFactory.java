package com.zkw.designpatterns.creational.factory.abstractfactory;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-21 下午 5:42
 **/

public class SendMailFactory implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}
