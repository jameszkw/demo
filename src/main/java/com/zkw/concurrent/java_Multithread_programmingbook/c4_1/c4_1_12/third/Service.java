package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_12.third;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:21
 **/

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock=new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
