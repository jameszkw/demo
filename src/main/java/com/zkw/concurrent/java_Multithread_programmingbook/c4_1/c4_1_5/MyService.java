package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:41
 **/

public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA时间为 "+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
            condition.await();
            System.out.println("end aswitA时间为 "+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin awaitB时间为 "+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
            condition.await();
            System.out.println("end aswitB时间为 "+System.currentTimeMillis()+"threadname="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void singalAll(){
        try {
            lock.lock();
            System.out.println("signalAll时间为 "+System.currentTimeMillis()+" threadname="+Thread.currentThread().getName());
            condition.signalAll();

        } finally {
            lock.unlock();
        }
    }
}
