package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:50
 **/

public class MyService {
    private Lock lock=new ReentrantLock();
    public Condition conditionA=lock.newCondition();
    public Condition conditionB=lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA时间为"+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA时间为"+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin awaitB时间为"+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end awaitB时间为"+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void singnalAll_A(){
        try {
            lock.lock();
            System.out.println("singnalAll_A时间为"+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
            conditionA.signalAll();

        }finally {
            lock.unlock();
        }
    }

    public void singalAll_B(){
        try {
            lock.lock();
            System.out.println("singnalAll_B时间为"+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
            conditionB.signalAll();

        }finally {
            lock.unlock();
        }
    }
}
