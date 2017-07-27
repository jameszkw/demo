package com.zkw.designpatterns.justtest.cglibdemo1;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class AuthProxy implements MethodInterceptor {
    private String name ;
    //传入用户名称
    public AuthProxy(String name){
        this.name = name;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //用户进行判断
        if(!"张三".equals(name)){
            System.out.println("你没有权限！");
            return null;
        }
        return methodProxy.invokeSuper(o, objects);
    }
}
