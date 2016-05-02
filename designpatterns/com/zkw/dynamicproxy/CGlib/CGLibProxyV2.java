package com.zkw.dynamicproxy.CGlib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/2 0002.
 * 代理模式 - 单例模式（双重加锁实现单例）
 * 注意：在java1.4及以前版本中，很多JVM对于volatile关键字的实现的问题，会导致“双重检查加锁”的失败，因此“双重检查加锁”机制只只能用在java5及以上的版本。
 */
public class CGLibProxyV2 implements MethodInterceptor {
    private volatile static CGLibProxyV2 cgLibProxyV2=null;

    private CGLibProxyV2() {}

    public static CGLibProxyV2 instance(){
        if (cgLibProxyV2 ==null){
            synchronized (CGLibProxyV2.class){
                if (cgLibProxyV2 ==null){
                    cgLibProxyV2 = new CGLibProxyV2();
                }
            }
        }
        return cgLibProxyV2;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return result;
    }

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }
}
