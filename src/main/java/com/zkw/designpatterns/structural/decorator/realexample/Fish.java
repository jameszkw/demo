package com.zkw.designpatterns.structural.decorator.realexample;

/**
 * 具体装饰角色“鱼儿”
 *
 * @author James
 * @create 2017-07-06 下午 2:06
 **/

public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Fish Move");
    }
}
