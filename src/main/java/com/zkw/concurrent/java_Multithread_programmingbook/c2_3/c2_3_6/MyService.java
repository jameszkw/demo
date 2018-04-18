package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_6;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 原子类在具有又逻辑性的情况下输出结果也具有随机性。也就是，最终的结果是正确的，但是中间的过程是无序的。
 *
 * @author James
 * @create 2017-09-09 下午 7:31
 **/

public class MyService {
    public static AtomicLong aiRef=new AtomicLong();

    public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
