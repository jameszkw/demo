package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_6;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 解决中间过程无序问题
 *
 * @author James
 * @create 2017-09-09 下午 7:45
 **/

public class MyServiceSafe{
//    public static AtomicInteger aiRef=new AtomicInteger(0);
    public static int count;
    synchronized public void addNum(){
        /*System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);*/
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+(count+=100));
        ++count;
    }
}
