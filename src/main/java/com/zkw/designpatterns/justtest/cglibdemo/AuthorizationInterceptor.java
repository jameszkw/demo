package com.zkw.designpatterns.justtest.cglibdemo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * A simple MethodInterceptor implementation to
 * apply authorization checks for proxy method calls.
 *
 */
public class AuthorizationInterceptor implements MethodInterceptor {
    private AuthorizationService authorizationService;
    /**
     * Create a AuthorizationInterceptor with the given
     * AuthorizationService
     */
    public AuthorizationInterceptor (AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (authorizationService != null) {
            //may throw an AuthorizationException if authorization failed
            authorizationService.authorize(method);
        }
        return methodProxy.invokeSuper(o, objects);
    }
}
