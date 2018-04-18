package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:00
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        String username=null;
        System.out.println(username.hashCode());
    }


}
