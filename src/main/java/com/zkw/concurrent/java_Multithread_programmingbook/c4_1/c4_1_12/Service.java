package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_12;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:11
 **/

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("公平锁情况"+lock.isFair());
        } finally {
            lock.unlock();
        }

    }

}
