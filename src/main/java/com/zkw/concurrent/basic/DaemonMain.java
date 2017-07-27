package com.zkw.concurrent.basic;

/**
 * Created by Administrator on 2016/4/25 0025.
 */
public class DaemonMain {
    public static class DaemonT extends Thread{
        @Override
        public void run() {
            while (true){
                System.out.println("I am alive");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            Thread t=new DaemonT();
            t.setDaemon(true);
            t.start();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
