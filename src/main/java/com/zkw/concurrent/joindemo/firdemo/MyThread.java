package com.zkw.concurrent.joindemo.firdemo;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-27 上午 10:38
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        int second = (int)(Math.random()*10000);
        System.out.println(second);
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
