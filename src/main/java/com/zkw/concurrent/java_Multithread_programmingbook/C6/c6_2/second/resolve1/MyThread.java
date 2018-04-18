package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_2.second.resolve1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-18 下午 9:29
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
