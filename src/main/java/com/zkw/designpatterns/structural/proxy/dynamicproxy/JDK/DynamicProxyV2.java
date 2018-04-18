package com.zkw.designpatterns.structural.proxy.dynamicproxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/5/2 0002.
 * 缺点：jdk动态代理的被代理类必须实现或继承接口
 */
public class DynamicProxyV2 implements InvocationHandler {
    private Object target;

    public DynamicProxyV2(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before V2");
        Object result = method.invoke(target, args);
        System.out.println("after V2");
        return result;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
