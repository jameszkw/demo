package com.zkw.dynamicproxy.JDK;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/5/2 0002.
 * 使用动态代理
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractObject obj = new RealObject();
        DynamicProxy proxy = new DynamicProxy(obj);
        AbstractObject objProxy = (AbstractObject)Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),proxy);
        objProxy.say("James");
    }
}
