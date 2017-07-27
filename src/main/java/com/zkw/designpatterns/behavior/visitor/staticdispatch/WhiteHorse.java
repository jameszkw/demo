package com.zkw.designpatterns.behavior.visitor.staticdispatch;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 上午 10:31
 **/

public class WhiteHorse extends Horse {
    @Override
    public void eat() {
        System.out.println("白马吃草");
    }
}
