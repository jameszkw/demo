package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:46
 **/

public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }
}
