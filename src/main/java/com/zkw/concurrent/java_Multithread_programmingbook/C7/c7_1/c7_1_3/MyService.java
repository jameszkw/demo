package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_3;

/**
 * 验证BLOCKED
 *
 * @author James
 * @create 2017-09-19 下午 8:17
 **/

public class MyService {
    synchronized static public void serviceMethod(){
        try {
            System.out.println(Thread.currentThread().getName()+"进入了业务方法！");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
