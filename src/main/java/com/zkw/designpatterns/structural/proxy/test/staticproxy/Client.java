package com.zkw.designpatterns.structural.proxy.test.staticproxy;

/**
 * 客户端
 *
 * @author James
 * @create 2017-07-03 下午 6:33
 **/

public class Client {
    public static void main(String[] args) {
        AbstractObject abstractObject = new CompleteProxy();
        abstractObject.process();
    }
}
