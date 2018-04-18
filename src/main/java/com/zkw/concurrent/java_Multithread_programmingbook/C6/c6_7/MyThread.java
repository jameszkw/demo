package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_7;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 7:40
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(MyObject.getObject().hashCode());
        }
    }
}
