package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_1;

/**
 * 调用interrupt()方法并不会像for+break立即停止线程.仅仅是在当前方法中打了一个标记。
 *
 * @author James
 * @create 2017-09-10 上午 11:09
 **/

public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
