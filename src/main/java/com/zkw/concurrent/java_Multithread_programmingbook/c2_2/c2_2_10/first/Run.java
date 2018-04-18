package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_10.first;

/**
 * synchronized(String)同步块与String联合使用时，要注意常量池带来的一些例外.
 * 常量池包括：基本类型变量，String对象，类和接口的全限定名，字段的名称和描述符，方法的名称和描述符。
 * 此程序的问题是只有一个线程执行，这就是两个值都是AA字符串
 *
 * @author James
 * @create 2017-09-09 下午 2:13
 **/

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
