package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_11;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 7:55
 **/

public class Service {
    public ReentrantLock lock=new ReentrantLock();
    public Condition newCondition=lock.newCondition();
    public void waitMethod(){
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


}
