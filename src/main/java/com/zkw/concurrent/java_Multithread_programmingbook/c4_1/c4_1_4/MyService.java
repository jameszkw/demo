package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:32
 **/

public class MyService {
    private Lock lock=new ReentrantLock();
    public Condition condition=lock.newCondition();
    public void await(){
        lock.lock();
        System.out.println(" await时间为 "+System.currentTimeMillis());
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("signal时间为"+System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }

    }
}
