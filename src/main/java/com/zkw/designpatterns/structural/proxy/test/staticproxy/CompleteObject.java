package com.zkw.designpatterns.structural.proxy.test.staticproxy;

/**
 * 实现抽象类
 *
 * @author James
 * @create 2017-07-03 下午 6:32
 **/

public class CompleteObject implements AbstractObject {
    public void process() {
        System.out.println("complete object ... ...");
    }
}
