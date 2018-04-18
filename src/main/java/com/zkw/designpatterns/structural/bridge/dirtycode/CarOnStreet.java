package com.zkw.designpatterns.structural.bridge.dirtycode;

/**
 * 小汽车在市区街道行驶
 *
 * @author James
 * @create 2017-06-22 下午 4:45
 **/

public class CarOnStreet extends Street {
    void run() {
        System.out.println("小汽车在市区街道行驶");
    }
}
