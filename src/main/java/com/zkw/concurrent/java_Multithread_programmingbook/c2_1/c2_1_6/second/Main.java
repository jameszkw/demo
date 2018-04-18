package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_6.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 9:35
 **/

public class Main {
    public int i=10;
    synchronized public void operateIMainMethod(){
        i--;
        System.out.println("main print i="+i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
