package com.zkw.immutable;


/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class Thread1 implements Runnable {
    private static Integer in=0;

    public void run() {
        System.out.println("thread: "+(++in));
    }
}
