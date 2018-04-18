package com.zkw.designpatterns.creational.factory.abstractfactory;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-21 下午 5:41
 **/

public class MailSender implements Sender {
    public void send() {
        System.out.println("this is mailsender!");
    }
}
