package com.zkw.designpatterns.creational.factory.factorymethod.commonfactory.demo1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-21 下午 5:15
 **/

public class MailSender implements Sender {
    public void send() {
        System.out.println("this is mailsender!");
    }
}
