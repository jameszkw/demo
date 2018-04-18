package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_8;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 9:59
 **/

public class Sub extends Main {
    @Override
    public void serviceMethod() {
        System.out.println("int sub 下一步sleep begin threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.serviceMethod();
    }
}
