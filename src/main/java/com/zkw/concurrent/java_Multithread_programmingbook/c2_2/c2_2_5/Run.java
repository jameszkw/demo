package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_5;

/**
 * 同一个object中的所有其他synchronized(this)代码块访问都被阻塞。
 *
 * @author James
 * @create 2017-09-07 下午 8:30
 **/

public class Run {
    public static void main(String[] args) {
        ObjectService service=new ObjectService();
        ThreadA a=new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
