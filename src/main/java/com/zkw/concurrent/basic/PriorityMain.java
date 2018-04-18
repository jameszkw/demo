package com.zkw.concurrent.basic;

/**
 * Created by Administrator on 2016/4/25 0025.
 */
public class PriorityMain {

    public static class HightPriority extends Thread{
        static int count=0;

        @Override
        public void run() {
            while (true){
                synchronized (this){
                    count++;
                    if(count>10000){
                        System.out.println("high is complete");
                        break;
                    }
                }
            }
        }
    }

    public static class LowPriority extends Thread{
        static int count=0;

        @Override
        public void run() {
            while (true){
                synchronized (this){
                    System.out.println("lowprioriry is complete");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread high=new HightPriority();
        LowPriority low=new LowPriority();
        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);
        low.start();
        high.start();
    }
}
