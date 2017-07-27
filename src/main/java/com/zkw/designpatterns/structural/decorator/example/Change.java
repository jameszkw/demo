package com.zkw.designpatterns.structural.decorator.example;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;
    public Change(TheGreatestSage sage){
        this.sage = sage;
    }

    public void move() {
        // 代码
        sage.move();
    }
}
