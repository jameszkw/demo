package com.zkw.designpatterns.structural.proxy.dynamicproxy.CGlib;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public class MainTest {
    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        RealObject realObject =cgLibProxy.getProxy(RealObject.class);
        realObject.say("james cglib");

        RealObject ori = new RealObject();
        ori.say("james ori");
    }
}
