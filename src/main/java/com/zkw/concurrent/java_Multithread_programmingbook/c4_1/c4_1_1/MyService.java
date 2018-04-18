package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 9:55
 **/

public class MyService {
    private Lock lock=new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i=0;i<5;i++){
            System.out.println("Threadname="+Thread.currentThread().getName()+(" "+(i+1)));
        }
        lock.unlock();
    }
}
