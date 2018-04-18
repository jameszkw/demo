package com.zkw.designpatterns.behavior.visitor.dynamicdispatch;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 上午 10:37
 **/

public class BlackHorse extends Horse {
    @Override
    public void eat() {
        System.out.println("黑马吃草");
    }
}
