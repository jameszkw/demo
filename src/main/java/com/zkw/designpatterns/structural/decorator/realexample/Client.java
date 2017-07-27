package com.zkw.designpatterns.structural.decorator.realexample;

/**
 * 装饰模式又名包装(Wrapper)模式。装饰模式以对客户端透明的方式扩展对象的功能，是继承关系的一个替代方案。
 *
 * @author James
 * @create 2017-07-06 下午 2:09
 **/

public class Client {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
//        TheGreatestSage fish = new Fish(bird);
//        fish.move();
        // 第二种写法
        TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
    }
}
