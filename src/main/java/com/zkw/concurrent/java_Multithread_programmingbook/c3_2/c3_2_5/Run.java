package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_5;

/**
 * Thread.sleep()不释放锁
 *
 * @author James
 * @create 2017-09-13 下午 8:00
 **/

public class Run {
    public static void main(String[] args) {
        ThreadB b=new ThreadB();
        ThreadA a=new ThreadA(b);
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadC c=new ThreadC(b);
        c.start();
    }
}
