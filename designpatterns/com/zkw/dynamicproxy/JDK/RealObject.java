package com.zkw.dynamicproxy.JDK;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public class RealObject implements AbstractObject {
    public void say(String name) {
        System.out.println("realObject "+name);
    }
}
