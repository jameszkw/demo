package com.zkw.concurrent.justest;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-02 下午 8:55
 **/

public class MainTest {
    AtomicBoolean atomicDouble = new AtomicBoolean();
    ReentrantLock lock = new ReentrantLock();
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    static Target target1= new Target();
    static Target target2 = new Target();
    public static void main(String[] args) {
        Thread thread1 = new Thread(target1);
        thread1.start();
        Thread thread2 = new Thread(target2);
        thread2.start();
        Object o = new Object();

        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread1.currentThread().getState());
            System.out.println(thread2.currentThread().getState());

        }


    }
}
