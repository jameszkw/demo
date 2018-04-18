package com.zkw.designpatterns.structural.decorator.realexample;

/**
 * 抽象装饰角色
 *
 * @author James
 * @create 2017-07-06 上午 11:31
 **/

public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }

    public void move() {
        sage.move();
    }
}
