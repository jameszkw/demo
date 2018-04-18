package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_3;

/**
 * 会死循环的原因是，对isRunning的修改仅仅修改的是主内存中的。而线程读取的是线程私有栈中的数据。
 *
 * @author James
 * @create 2017-09-09 下午 6:41
 **/

public class Run {
    public static void main(String[] args) {
        RunThread thread=new RunThread();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setRunning(false);
        System.out.println("已经赋值为false");

    }
}
