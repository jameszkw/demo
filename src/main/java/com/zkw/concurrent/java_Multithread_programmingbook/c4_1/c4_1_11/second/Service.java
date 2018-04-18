package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_11.second;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:02
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
            System.out.println("有没有线程正在等待newCOndition?"+lock.hasWaiters(newCondition)+" 线程数是多少？"+lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        } finally {
            lock.unlock();
        }

    }
}
