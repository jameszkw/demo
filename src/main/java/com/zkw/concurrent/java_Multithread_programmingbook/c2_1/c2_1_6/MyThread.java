package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 9:30
 **/

public class MyThread extends Thread{
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
