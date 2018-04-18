package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-11 下午 8:09
 **/

public class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        Service service=new Service();
        ThreadA a=new ThreadA(lock,service);
        a.start();
        try {
            Thread.sleep(500);
            ThreadB b=new ThreadB(lock,service);
            b.start();
            System.out.println(b.getState());
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
