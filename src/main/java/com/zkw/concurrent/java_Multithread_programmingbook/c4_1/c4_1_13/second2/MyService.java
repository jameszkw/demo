package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_13.second2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:40
 **/

public class MyService {
    public ReentrantLock lock=new ReentrantLock();
    public void waitMethod(){
        if (lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得锁");
        } else {
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
    }
}
