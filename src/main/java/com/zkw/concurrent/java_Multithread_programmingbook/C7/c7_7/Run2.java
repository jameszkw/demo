package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:51
 **/

public class Run2 {
    public void test(){
        ExecutorService service= Executors.newFixedThreadPool(2);
        service.submit(new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId()+"run");
            }
        });
    }

    public static void main(String[] args) {
        MyThreadGroup group=new MyThreadGroup("我的线程组");
        MyThread myThread=new MyThread(group,"我的线程");
        //对象
//        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        //类
//        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();

        Run2 run2=new Run2();
        run2.test();
    }
}
