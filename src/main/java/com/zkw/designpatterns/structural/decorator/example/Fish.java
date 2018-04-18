package com.zkw.designpatterns.structural.decorator.example;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Fish Move");
    }
}
