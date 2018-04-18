package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_9.second;

/**
 * 异步的原因是持有不同的锁。一个是对象锁，一个是Class锁，而Class锁可以对类的所有对象实例起作用
 *
 * @author James
 * @create 2017-09-08 下午 10:12
 **/

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        Service service2=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service2);
        b.setName("B");
        b.start();
        ThreadC c=new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
