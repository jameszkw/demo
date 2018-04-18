package com.zkw.concurrent.thread_status;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 2:59
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
    }
}
