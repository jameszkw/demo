package com.zkw.concurrent.java_Multithread_programmingbook.c3_4.c3_4_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 9:16
 **/

public class Run {
    public static void main(String[] args) {
       /* for (int i=0;i<10;i++){
            System.out.println(" 在main线程中取值="+Tools.t1.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        ThreadA a=new ThreadA();
        a.start();
        ThreadB b=new ThreadB();
        b.start();
    }
}
