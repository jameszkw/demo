package com.zkw.dynamicproxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/2 0002.
 * 动态代理-通过反射实现
 * 缺点：每一个被代理类（RealObject）都需要一个Proxy.newProxyInstance(）方法去生成代理类。v2可解决。
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(target,args);
        System.out.println("after");
        return result;
    }
}
