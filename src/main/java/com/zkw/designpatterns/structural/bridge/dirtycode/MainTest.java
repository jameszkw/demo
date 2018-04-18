package com.zkw.designpatterns.structural.bridge.dirtycode;

/**
 * 测试
 *
 * @author James
 * @create 2017-06-22 下午 4:48
 **/

public class MainTest {
    public static void main(String[] args) {
        //小汽车在高速公路行驶
        CarOnSpeedWay carOnSpeedWay = new CarOnSpeedWay();
        carOnSpeedWay.run();
        //公交车在市区街道行驶
        BusOnStreet busOnStreet = new BusOnStreet();
        busOnStreet.run();
    }
}
