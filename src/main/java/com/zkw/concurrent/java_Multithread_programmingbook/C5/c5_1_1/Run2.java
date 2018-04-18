package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 可创建多个任务，并顺序执行，即前一个任务执行完后面的任务才执行。
 * */
public class Run2 {
    private static Timer timer=new Timer();
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            System.out.println("1 运行了！时间为："+new Date());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1 停止了！时间为："+new Date());

        }
    }
    static public class MyTask2 extends TimerTask{
        @Override
        public void run() {
            System.out.println("2运行了！时间为："+new Date());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2停止了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt1=rightNow.getTime();
        rightNow.clear();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt2=rightNow.getTime();
        System.out.println("字符串1时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        System.out.println("字符串2时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(task1,dt1);
        timer.schedule(task2,dt2);
    }

}
