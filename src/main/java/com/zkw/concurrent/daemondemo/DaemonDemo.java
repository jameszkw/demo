package com.zkw.concurrent.daemondemo;

/**
 * 测试后台线程
 *
 * @author James
 * @create 2017-09-03 下午 2:15
 **/

public class DaemonDemo implements Runnable {
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
                System.out.println("daemon thread...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonDemo());
        thread.setDaemon(true);
        thread.start();
    }
}
