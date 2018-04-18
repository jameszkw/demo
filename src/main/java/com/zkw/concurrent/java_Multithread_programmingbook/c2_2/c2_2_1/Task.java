package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 7:45
 **/

public class Task {
    private String getData1;
    private String getData2;
    public synchronized void doLongTimeTask(){
        System.out.println("begin task");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getData1="长时间处理任务后从远程返回的值1 threadName="+Thread.currentThread().getName();
        getData2="长时间处理任务后从远程返回的值2 threadname="+Thread.currentThread().getName();
        System.out.println(getData1);
        System.out.println(getData2);
        System.out.println("end task");
    }
}
