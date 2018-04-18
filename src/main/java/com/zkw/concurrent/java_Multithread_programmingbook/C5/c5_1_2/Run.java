package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
 * 在指定的日期后，按指定的时间间隔无线的循环执行
 * */
public class Run {
    private static Timer timer=new Timer();
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task=new MyTask();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(task,dt1,4000);
    }
}
