package com.zkw.creational.builder.demo1;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public class WelcomeBuilder extends Builder{
    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("welcome subject");
    }

    @Override
    public void buildBody() {
        msg.setBody("welcome body");
    }
}
