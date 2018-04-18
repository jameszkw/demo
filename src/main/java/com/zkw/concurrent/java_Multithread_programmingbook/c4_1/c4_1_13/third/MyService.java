package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_13.third;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:44
 **/

public class MyService {
    public ReentrantLock lock=new ReentrantLock();
    public void waitMethod(){
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println(" "+Thread.currentThread().getName()+"获取锁的时间"+System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println(" "+Thread.currentThread().getName()+"没有获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
