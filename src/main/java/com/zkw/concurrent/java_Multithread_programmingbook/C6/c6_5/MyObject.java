package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_5;

/**
 * 使用static代码块实现单例模式
 *
 * @author James
 * @create 2017-09-18 下午 10:22
 **/

public class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }
    static {
        myObject=new MyObject();
    }
    public static MyObject getInstance(){
        return myObject;
    }
}
