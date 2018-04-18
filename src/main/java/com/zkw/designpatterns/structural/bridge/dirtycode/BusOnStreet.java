package com.zkw.designpatterns.structural.bridge.dirtycode;

/**
 * 公交车在市区街道行驶
 *
 * @author James
 * @create 2017-06-22 下午 4:46
 **/

public class BusOnStreet extends Street {
    void run() {
        System.out.println("公交车在市区街道行驶");
    }
}
