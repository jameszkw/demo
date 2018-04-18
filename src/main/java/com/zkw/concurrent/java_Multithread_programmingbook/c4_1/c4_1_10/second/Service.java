package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_10.second;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 5:23
 **/

public class Service {
    public ReentrantLock lock=new ReentrantLock();
    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("threadname="+Thread.currentThread().getName()+"进入方法！");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
