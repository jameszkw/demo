package com.zkw.designpatterns.behavior.command;

/**
 * 接收者类，知道如何实施与执行一个请求相关的操作，任何类都可能作为一个接收者。
 *
 * @author James
 * @create 2017-06-28 上午 11:06
 **/

public class Receiver {
    public void doSomething(){
        System.out.println("接受者-业务逻辑处理");
    }
}
