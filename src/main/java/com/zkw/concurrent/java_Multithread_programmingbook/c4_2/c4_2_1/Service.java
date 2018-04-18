package com.zkw.concurrent.java_Multithread_programmingbook.c4_2.c4_2_1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-18 下午 8:37
 **/

public class Service {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    public void read(){
        try {
            lock.readLock().lock();
            System.out.println("获得读锁"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}
