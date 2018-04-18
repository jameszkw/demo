package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 5:18
 **/

public class Run {
    public static void main(String[] args) {
        PrintString printString=new PrintString();
        new Thread(printString).start();
//        System.out.println("我要停止它！ stopThread="+Thread.currentThread().getName());
//        printString.setConti(false);
    }
}
