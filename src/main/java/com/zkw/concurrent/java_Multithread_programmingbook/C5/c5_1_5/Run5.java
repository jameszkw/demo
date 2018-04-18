package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *  schedule方法不具有追赶执行性
 * */
public class Run5 {
    private static Timer timer=new Timer();
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            System.out.println("1 begin 运行了！时间为："+new Date());
            System.out.println("1 end 运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask1 myTask1=new MyTask1();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(myTask1,dt1,5000);
    }

}
