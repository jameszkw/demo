package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_7;

/**
 * 生产者/消费者模式：一对一交替打印
 *
 * @author James
 * @create 2017-09-17 下午 3:09
 **/

public class Run {
    public static void main(String[] args) {
        MyService myService=new MyService();
        ThreadA a=new ThreadA(myService);
        a.start();
        ThreadB b=new ThreadB(myService);
        b.start();
    }
}
