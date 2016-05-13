package com.zkw.creational.builder.demo1;

import java.util.Date;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public abstract class Builder {

    protected AutoMessage msg;

    public abstract void buildSubject();
    public abstract void buildBody();
    public void buildTo(String to){
        msg.setTo(to);
    }
    public void buildFrom(String from){
        msg.setFrom(from);
    }
    public void buildSendDate(){
        msg.setSendDate(new Date());
    }
    public void sendMessage(){
        msg.send();
    }
}
