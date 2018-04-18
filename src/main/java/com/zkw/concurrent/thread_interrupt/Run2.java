package com.zkw.concurrent.thread_interrupt;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 5:46
 **/

public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("\n是否停止1？="+Thread.interrupted());
        System.out.println("\n是否停止2？="+Thread.interrupted());
        System.out.println("\nend");
    }
}
