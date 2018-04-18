package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer类中的cancel()方法有时并不一定停止执行计划任务，而是正常执行。(这个我没有测出来！！！)
 * */
public class Run4 {
    static int i=0;
    static public class MyTask extends TimerTask{
        public void run() {
            System.out.println("正常执行了"+i);
        }
    }

    public static void main(String[] args) {
        while (true){
            i++;
            Timer timer=new Timer();
            MyTask myTask=new MyTask();
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(new Date());
            rightNow.add(Calendar.SECOND,10);
            Date dt1=rightNow.getTime();
            System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
            timer.schedule(myTask,dt1);
            timer.cancel();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
