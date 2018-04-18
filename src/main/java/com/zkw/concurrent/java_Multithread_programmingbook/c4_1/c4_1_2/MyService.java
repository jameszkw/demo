package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:11
 **/

public class MyService {
    private Lock lock=new ReentrantLock();
    public void methodA(){
        try {
            lock.lock();
            System.out.println("methodA begin threadname="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end threadname="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try {
            lock.lock();
            System.out.println("methodA begin threadname="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end threadname="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
