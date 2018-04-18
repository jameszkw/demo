package com.zkw.designpatterns.structural.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-22 下午 4:58
 **/

public class SpeedWay extends AbstractRoad {
    @Override
    void run() {
        super.run();
        aCar.run();
        System.out.println("在高速公路行驶");
    }
}
