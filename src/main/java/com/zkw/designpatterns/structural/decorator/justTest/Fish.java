package com.zkw.designpatterns.structural.decorator.justTest;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class Fish extends Change {
    public Fish(GreatMonkey greatMonkey) {
        super(greatMonkey);
    }

    @Override
    public void move() {
        System.out.println("fish move");
    }
}
