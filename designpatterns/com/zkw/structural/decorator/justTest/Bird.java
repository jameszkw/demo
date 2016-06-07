package com.zkw.structural.decorator.justTest;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class Bird extends Change {
    public Bird(GreatMonkey greatMonkey) {
        super(greatMonkey);
    }

    @Override
    public void move() {
        System.out.println("bird move");
    }
}
