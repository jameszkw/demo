package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_3;

/**
 * 使用内部静态类实现单例模式
 * 缺陷是：如果遇到序列化对象时，运行得到的结果还是多例的
 *
 * @author James
 * @create 2017-09-18 下午 9:59
 **/

public class MyObject {
    private static class MyObjectHandler{
        private static MyObject myObject=new MyObject();
    }

    public MyObject() {
    }
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
