package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_16;

/**
 * 50毫秒后锁为“456”
 *
 * @author James
 * @create 2017-09-09 下午 4:45
 **/

public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();
        Thread.sleep(50);//存在50毫秒
        b.start();
    }
}
