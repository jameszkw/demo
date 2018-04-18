package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_1;

/**
 * 用join()解决
 *
 * @author James
 * @create 2017-09-12 下午 9:55
 **/

public class Test {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
//        Thread.sleep(?);
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
        System.out.println("答案是：不能确定！");
    }
}
