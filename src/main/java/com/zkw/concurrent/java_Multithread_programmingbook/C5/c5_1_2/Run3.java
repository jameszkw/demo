package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer.cancel()全部任务被销毁，并且进程被销毁。
 * */
public class Run3 {
    private static Timer timer=new Timer();
    static public class MyTaskA extends TimerTask{
        @Override
        public void run() {
            System.out.println("A运行了！时间为："+new Date());
            timer.cancel();
        }
    }

    static public class MyTaskB extends TimerTask{
        @Override
        public void run() {
            System.out.println("B运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTaskA a=new MyTaskA();
        MyTaskB b=new MyTaskB();

        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(a,dt1,4000);
        timer.schedule(b,dt1,4000);
    }
}
