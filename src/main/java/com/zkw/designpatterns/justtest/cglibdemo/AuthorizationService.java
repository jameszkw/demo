package com.zkw.designpatterns.justtest.cglibdemo;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public interface  AuthorizationService {
    /**
     * Authorization check for a method call. An AuthorizationException
     * will be thrown if the check fails.
     */
    void authorize(Method method);
}
