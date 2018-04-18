package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 计划时间晚于当前时间，并且不是守护线程。结果为：在计划的时间执行任务
 * */
public class Run1 {
    private static Timer timer=new Timer();
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date().toLocaleString());

        }
    }

    public static void main(String[] args) {
        MyTask task=new MyTask();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-Mm-dd HH:mm:ss");
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,-700);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(task,dt1);
    }
}
