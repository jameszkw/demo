package com.zkw.concurrent.synchronizedemo.synchronized_deadlock.resolve_semaphore;

import java.util.concurrent.Semaphore;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 下午 4:25
 **/

public class UnDeadLock {
    public static String bowl = "碗";
    //信号量可以碗只能能被一个线程同时访问
    public static final Semaphore a1 = new Semaphore(1);
    public static String chopsticks = "筷子";
    //信号量可以筷子只能能被一个线程同时访问
    public static final Semaphore a2 = new Semaphore(1);

    public static void main(String[] args) {
        LockAa la = new LockAa();
        new Thread(la).start();
        LockBa lb = new LockBa();
        new Thread(lb).start();
    }


}
