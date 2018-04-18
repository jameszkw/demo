package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_6.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 9:39
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
