package com.zkw.designpatterns.structural.bridge.dirtycode;

/**
 * 市区街道
 *
 * @author James
 * @create 2017-06-22 下午 4:43
 **/

public class Street extends Road {
    @Override
    void run() {
        System.out.println("市区街道");
    }
}
