package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 11:13
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<100000;i++){
            System.out.print("i="+(i+1));
        }
    }
}
