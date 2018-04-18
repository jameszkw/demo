package com.zkw.designpatterns.justtest.cglibdemo1;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class AuthProxyFilter implements CallbackFilter {
    public int accept(Method method) {
        if(!"query".equalsIgnoreCase(method.getName()))
            return 0;
        return 1;
    }
}
