package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:43
 **/

public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.printf("线程组的异常处理");
        e.printStackTrace();
    }
}
