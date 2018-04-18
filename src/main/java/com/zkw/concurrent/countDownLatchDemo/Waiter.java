package com.zkw.concurrent.countDownLatchDemo;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class Waiter implements Runnable {
    CountDownLatch latch;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("waiter released");
    }

}
