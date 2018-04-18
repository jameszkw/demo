package com.zkw.concurrent.synchronizedemo.synchronized_reentrant.parent;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 11:18
 **/

public class Run {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
