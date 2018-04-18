package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_10.third;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 7:42
 **/

public class Service {
    private ReentrantLock lock=new ReentrantLock();
    private Condition newCondition=lock.newCondition();
    public void waitMethod(){
        try {
            lock.lock();
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("有"+lock.getWaitQueueLength(newCondition)+"个线程正在等待newCondition");
            newCondition.signal();
        }finally {
            lock.unlock();
        }

    }
}
