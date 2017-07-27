package com.zkw.designpatterns.structural.bridge.dirtycode;

/**
 * 公交车在高速公路行驶
 *
 * @author James
 * @create 2017-06-22 下午 4:47
 **/

public class BusOnSpeedWay extends SpeedWay {
    void run() {
        System.out.println("公交车在高速公路行驶");
    }
}
