package com.zkw.concurrent.synchronizedemo.synchronized_reentrant;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 11:10
 **/

public class Run {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
