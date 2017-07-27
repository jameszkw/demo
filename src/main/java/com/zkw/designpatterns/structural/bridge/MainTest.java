package com.zkw.designpatterns.structural.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-22 下午 5:00
 **/

public class MainTest {
    public static void main(String[] args) {
        AbstractRoad speedWay = new SpeedWay();
        speedWay.aCar = new Car();
        speedWay.run();

        AbstractRoad street = new Street();
        street.aCar = new Bus();
        street.run();
    }
}
