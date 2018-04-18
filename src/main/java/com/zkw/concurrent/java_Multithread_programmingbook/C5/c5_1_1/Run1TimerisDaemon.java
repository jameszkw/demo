package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 计划时间晚于当前时间，并且是守护线程。结果为：不执行任务
 * */
public class Run1TimerisDaemon {
    private static Timer timer=new Timer(true);
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date().toLocaleString());
        }
    }

    public static void main(String[] args) {
        MyTask task=new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        String dateString = "2018-04-17 17:12:28";
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,100);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.schedule(task,dt1);
    }

}
