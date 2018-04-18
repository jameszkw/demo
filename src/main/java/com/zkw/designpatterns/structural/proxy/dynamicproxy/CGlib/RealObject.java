package com.zkw.designpatterns.structural.proxy.dynamicproxy.CGlib;

import com.zkw.designpatterns.structural.proxy.dynamicproxy.JDK.AbstractObject;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public class RealObject implements AbstractObject {
    public void say(String name) {
        System.out.println("realObject "+name);
    }
}
