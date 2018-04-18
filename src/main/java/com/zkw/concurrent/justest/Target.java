package com.zkw.concurrent.justest;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-02 下午 8:54
 **/

public class Target implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getId());
            Thread.sleep(90000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
