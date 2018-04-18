package com.zkw.concurrent.java_Multithread_programmingbook.c1_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 8:34
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
    }
}
