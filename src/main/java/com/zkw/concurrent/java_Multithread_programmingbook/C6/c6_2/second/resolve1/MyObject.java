package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_2.second.resolve1;

/**
 * synchronized 修饰方法
 *
 * @author James
 * @create 2017-09-18 下午 9:26
 **/

public class MyObject {
    private static MyObject myObject;

    public MyObject() {

    }
    //设置同步方法效率太低了
    //整个方法被上锁
    synchronized public static MyObject getInstance(){
        try {
            if (myObject!=null){

            } else {
                //模拟在创建对象之前做一些准备行工作
                Thread.sleep(3000);
                myObject=new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
