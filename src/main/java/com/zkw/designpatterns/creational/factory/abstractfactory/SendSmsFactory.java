package com.zkw.designpatterns.creational.factory.abstractfactory;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-21 下午 5:43
 **/

public class SendSmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
