package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_6.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:17
 **/

public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("uncaughtException");
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
