package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 7:49
 **/

public class Test {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        try {
//            thread.join(2000);//只等待2秒
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" end timer="+System.currentTimeMillis());
    }
}
