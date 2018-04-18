package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_2.second.resolve3;

/**
 * 不能解决多线程创建单例对象得到多个不一样的对象问题
 *
 * @author James
 * @create 2017-09-18 下午 9:37
 **/

public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }
    public static MyObject getInstance(){
        try {
            if (myObject!=null){

            }else {
                //模拟创建对象之前做一些准备工作
                Thread.sleep(300);
                //使用synchronized（MyObject.class）
                //虽然部分代码被上锁
                //但还是有非线程安全问题
                synchronized (MyObject.class){
                    myObject=new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
