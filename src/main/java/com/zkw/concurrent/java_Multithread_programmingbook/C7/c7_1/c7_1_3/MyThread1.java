package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_3;

import com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_3.MyService;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 8:18
 **/

public class MyThread1 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
