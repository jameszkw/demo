package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_10.first;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 5:18
 **/

public class Service {
    private ReentrantLock lock=new ReentrantLock();
    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }


    }

    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount="+lock.getHoldCount());
        }finally {
            lock.unlock();
        }

    }
}
