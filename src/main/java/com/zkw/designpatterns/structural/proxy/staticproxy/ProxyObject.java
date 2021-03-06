package com.zkw.designpatterns.structural.proxy.staticproxy;

/**
 * Created by Administrator on 2016/5/1 0001.
 * 缺点：每一个被代理的类（RealObject）都需要写一个代理类（ProxyObject）.可用动态代理解决。
 */
public class ProxyObject extends AbstractObject {

    RealObject realObject = new RealObject();
    @Override
    public void operation() {
        //调用目标对象之前可以做相关操作
        System.out.println("before");
        realObject.operation();
        //调用目标对象之后可以做相关操作
        System.out.println("after");
    }
}
