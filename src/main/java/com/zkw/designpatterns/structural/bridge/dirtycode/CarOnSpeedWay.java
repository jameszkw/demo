package com.zkw.designpatterns.structural.bridge.dirtycode;

/**
 * 小汽车在高速公路行驶
 *
 * @author James
 * @create 2017-06-22 下午 4:46
 **/

public class CarOnSpeedWay extends SpeedWay {
    void run() {
        System.out.println("小汽车在高速公路行驶");
    }
}
