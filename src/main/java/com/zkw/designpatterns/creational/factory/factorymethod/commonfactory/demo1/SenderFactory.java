package com.zkw.designpatterns.creational.factory.factorymethod.commonfactory.demo1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-21 下午 5:16
 **/

public class SenderFactory {
    public Sender produce(String type){
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)){
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
