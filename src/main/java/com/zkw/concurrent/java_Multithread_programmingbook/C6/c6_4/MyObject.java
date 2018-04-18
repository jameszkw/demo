package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_4;

import java.io.Serializable;

/**
 * 加入readResolve()方法就能解决序列化与反序列化得到不同对象的问题
 *
 * @author James
 * @create 2017-09-18 下午 9:59
 **/

public class MyObject implements Serializable{
    private static final long serialVersionUID=888L;
    private static class MyObjectHandler{
        private static MyObject myObject=new MyObject();
    }

    private MyObject() {
    }
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    protected Object readResolve(){
        System.out.println("调用了readResolve方法！");
        return MyObjectHandler.myObject;
    }
}
