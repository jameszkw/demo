package com.zkw.immutable;

import java.util.Collections;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class TMain {
    public static void main(String[] args) {
        Thread thread1=new Thread(new Thread1());
        Thread thread2=new Thread(new Thread1());
        thread1.start();
        thread2.start();


    }
}
