package com.zkw.designpatterns.structural.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-22 下午 4:57
 **/

public class Street extends AbstractRoad {
    @Override
    void run() {
        super.run();
        aCar.run();
        System.out.println("在市区街道行驶");
    }
}
