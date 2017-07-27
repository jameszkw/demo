package com.zkw.designpatterns.structural.proxy.dynamicproxy.CGlib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/2 0002.
 * 代理模式 - 单例模式（枚举实现单例）
 */
public enum CGLibEnumProxyV3 implements MethodInterceptor {

    instance;

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return result;
    }

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }
}
