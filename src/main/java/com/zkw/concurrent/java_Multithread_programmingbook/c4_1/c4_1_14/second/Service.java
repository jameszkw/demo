package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_14.second;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:50
 **/

public class Service {
    private ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void testMethod(){
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.awaitUninterruptibly();
            System.out.println("wait end");
        }  finally {
            lock.unlock();
        }
    }
}
