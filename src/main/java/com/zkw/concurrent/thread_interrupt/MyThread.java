package com.zkw.concurrent.thread_interrupt;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 4:59
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<500000;i++){
            System.out.print("i");
        }
    }
}
