package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 11:08
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i=0;i<500000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
