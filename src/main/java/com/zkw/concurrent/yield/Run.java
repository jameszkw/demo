package com.zkw.concurrent.yield;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 上午 11:22
 **/

public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
    }
}
