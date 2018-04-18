package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:23
 **/

public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void await(){
        try {
            lock.lock();
            System.out.println("before");
            condition.await();
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("lock release!");
        }
    }
}
