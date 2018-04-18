package com.zkw.concurrent.joindemo.firdemo;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-27 上午 10:40
 **/

public class Test {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行完MyThread了才执行的主函数");
    }
}
