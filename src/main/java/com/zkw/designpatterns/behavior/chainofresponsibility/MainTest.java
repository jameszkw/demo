package com.zkw.designpatterns.behavior.chainofresponsibility;

/**
 * 责任链模式
 *
 * @author James
 * @create 2017-06-28 上午 10:54
 **/

public class MainTest {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }
}
