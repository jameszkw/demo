package com.zkw.designpatterns.creational.builder.demo1;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildBody() {
        msg.setBody("goodbye body");
    }

    @Override
    public void buildSubject() {
        msg.setSubject("goodbye subject");
    }
}
