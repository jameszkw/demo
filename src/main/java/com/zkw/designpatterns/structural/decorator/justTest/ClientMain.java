package com.zkw.designpatterns.structural.decorator.justTest;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class ClientMain {
    public static void main(String[] args) {
        Monkey monkey=new Monkey();
        // 第一种写法
        GreatMonkey bird=new Bird(monkey);
        GreatMonkey fish = new Fish(bird);
        bird.move();
        fish.move();

        // 第二种写法
        //GreatMonkey fish = new Fish(new Bird(sage));
    }
}
