package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_2;

/**
 * 当2个并发线程访问同一个对象object中的synchronized(this)同步代码块时，一段时间内只能有一个线程被执行。
 *
 * @author James
 * @create 2017-09-07 下午 8:20
 **/

public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a=new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
