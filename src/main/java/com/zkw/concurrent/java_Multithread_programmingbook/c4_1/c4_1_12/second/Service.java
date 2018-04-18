package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_12.second;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:16
 **/

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock=new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}
