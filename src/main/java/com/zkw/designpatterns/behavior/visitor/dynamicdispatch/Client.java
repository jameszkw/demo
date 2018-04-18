package com.zkw.designpatterns.behavior.visitor.dynamicdispatch;

/**
 * 动态分派
 *
 * @author James
 * @create 2017-06-29 上午 10:38
 **/

public class Client {
    public static void main(String[] args) {
        Horse h = new BlackHorse();
        h.eat();
    }
}
