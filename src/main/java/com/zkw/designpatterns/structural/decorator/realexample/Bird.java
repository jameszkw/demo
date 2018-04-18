package com.zkw.designpatterns.structural.decorator.realexample;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-06 下午 2:08
 **/

public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Bird Move");
    }
}
