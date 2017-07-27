package com.zkw.designpatterns.structural.decorator.justTest;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class Change implements GreatMonkey {
    private GreatMonkey greatMonkey;

    public Change(GreatMonkey greatMonkey) {
        this.greatMonkey = greatMonkey;
    }

    public void move() {
        greatMonkey.move();
    }
}
