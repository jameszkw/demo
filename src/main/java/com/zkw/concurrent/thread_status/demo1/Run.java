package com.zkw.concurrent.thread_status.demo1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 3:07
 **/

public class Run {
    public static void main(String[] args) {
        CountOperate c=new CountOperate();
        Thread t1=new Thread(c);
        System.out.println("main begin t1 isAlive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());
    }
}
