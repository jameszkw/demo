package com.zkw.concurrent.justest;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-02 下午 4:38
 **/

public class TestThread {
    private static class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println("thread1...");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread1());
        thread.start();
        System.out.println("main process end...");
    }
}
