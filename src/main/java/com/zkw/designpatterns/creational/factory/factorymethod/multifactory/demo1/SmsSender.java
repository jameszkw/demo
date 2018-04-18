package com.zkw.designpatterns.creational.factory.factorymethod.multifactory.demo1;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-21 下午 5:15
 **/

public class SmsSender implements Sender {
    public void send() {
        System.out.println("this is sms sender!");
    }
}
