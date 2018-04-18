package com.zkw.designpatterns.structural.proxy.dynamicproxy.JDK;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public class MainTestV2 {
    public static void main(String[] args) {
        DynamicProxyV2 dynamicProxyV2 = new DynamicProxyV2(new RealObject());
        AbstractObject proxy = dynamicProxyV2.getProxy();
        proxy.say("james2");
    }
}
