package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask将任务自身从任务队列中移除。
 * */
public class Run2 {
    static public Timer timer=new Timer();
    static public class MyTaskA extends TimerTask{
        @Override
        public void run() {
            System.out.println("A运行了！时间为："+new Date());
            this.cancel();//从任务队列中移除
        }
    }

    static public class MyTaskB extends TimerTask{
        @Override
        public void run() {
            System.out.println("B运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTaskA taskA=new MyTaskA();
        MyTaskB taskB=new MyTaskB();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(taskA,dt1,4000);
        timer.schedule(taskB,dt1,4000);

    }
}
