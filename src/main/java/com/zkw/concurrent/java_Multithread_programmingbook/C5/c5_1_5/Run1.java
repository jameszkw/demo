package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试schedule方法任务不延时
 *
 * */
public class Run1 {
    private static Timer timer=new Timer();
    private static int runCount=0;
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            System.out.println("1 begin运行了！时间为："+new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1 end运行了！时间为："+new Date());
            runCount++;
            if (runCount==5){
                timer.cancel();
            }
        }
    }

    public static void main(String[] args) {
        MyTask1 task1=new MyTask1();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(task1,dt1,3000);
    }
}
