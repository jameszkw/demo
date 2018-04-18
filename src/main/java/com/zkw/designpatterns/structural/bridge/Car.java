package com.zkw.designpatterns.structural.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-22 下午 4:59
 **/

public class Car extends AbstractCar {
    @Override
    void run() {
        super.run();
        System.out.print("小汽车");
    }
}
