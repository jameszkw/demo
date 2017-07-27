package com.zkw.designpatterns.structural.proxy.dynamicproxy.CGlib;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public class MainTestV3 {
    public static void main(String[] args) {
        RealObject realObject = CGLibEnumProxyV3.instance.getProxy(RealObject.class);
        realObject.say("single");
    }
}
