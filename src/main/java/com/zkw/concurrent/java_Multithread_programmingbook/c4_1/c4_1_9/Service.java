package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_9;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 4:00
 **/

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock=new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("threadname="+Thread.currentThread().getName()+"获得锁定");
        } finally {
            lock.unlock();
        }

    }

}
