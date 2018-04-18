package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务开始执行时间被任务执行时的时间延迟了。
 * */
public class Run2_1 {
    static private Timer timer=new Timer();

    static public class MyTaskA extends TimerTask{
        @Override
        public void run() {
            System.out.println("A运行了！时间为："+new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A结束了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTaskA taskA=new MyTaskA();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(taskA,dt1,400);
    }
}
