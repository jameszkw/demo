package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_14;

/**
 * 内置类有2个同步方法，但使用的却是不同的锁，打印结果也是异步的。
 *
 * @author James
 * @create 2017-09-09 下午 4:04
 **/

public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("其他的锁"){
                for (int i=1;i<=10;i++){
                    System.out.println(Thread.currentThread().getName()+"i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        synchronized public void method2(){
            for (int i=1;i<=20;i++){
                System.out.println(Thread.currentThread().getName()+"i="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
