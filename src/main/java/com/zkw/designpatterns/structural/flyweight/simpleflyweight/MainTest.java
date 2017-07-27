package com.zkw.designpatterns.structural.flyweight.simpleflyweight;

/**
 * 单纯享元模式
 *
 * @author James
 * @create 2017-06-26 下午 3:48
 **/

public class MainTest {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        FlyWeight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");

        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }
}
