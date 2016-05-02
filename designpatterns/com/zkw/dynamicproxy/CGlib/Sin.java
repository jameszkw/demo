package com.zkw.dynamicproxy.CGlib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public enum  Sin implements MethodInterceptor {
    Sin;


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
