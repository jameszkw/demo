package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 10:04
 **/

public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++){
            String newString=new String();
            Math.random();
        }
    }
}
