package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_13.second;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:25
 **/

public class MyService {
    public ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void waitMethod(){
        try {
//            lock.lock();
            lock.lockInterruptibly();
            System.out.println("lock begin "+Thread.currentThread().getName());
            for (int i=0;i<5000000;i++){
                String newString=new String();
                Math.random();
            }
            System.out.println("lock end "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
