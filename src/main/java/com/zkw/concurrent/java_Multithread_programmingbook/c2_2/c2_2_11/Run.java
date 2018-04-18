package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_11;

/**
 * 同步方法容易引起死循环
 * 可以用同步块来解决问题。
 *
 * @author James
 * @create 2017-09-09 下午 2:39
 **/

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.start();
        ThreadB b=new ThreadB(service);
        b.start();
    }
}
