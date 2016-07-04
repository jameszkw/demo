package com.zkw.cglibdemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class Demo {
    public Object createProxy(Class targetClass){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(NoOp.INSTANCE);
        return enhancer.create();
    }


    public static void main(String[] args) {

    }
}
