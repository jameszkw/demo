package com.zkw.designpatterns.structural.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-22 下午 4:59
 **/

public class Bus extends AbstractCar {
    @Override
    void run() {
        super.run();
        System.out.print("公交车");
    }
}
