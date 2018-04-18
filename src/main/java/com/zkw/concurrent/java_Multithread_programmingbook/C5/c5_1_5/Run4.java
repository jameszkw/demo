package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试scheduleAtFixedRate方法任务延时
 * */
public class Run4 {
    private static Timer timer=new Timer();
    private static int runCount=0;
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("1 begin 运行了！时间为："+new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1 end 运行了！时间为："+new Date());
            runCount++;
            if (runCount==5){
                this.cancel();
            }
        }
    }

    public static void main(String[] args) {
        MyTask1 myTask1=new MyTask1();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.SECOND,10);
        Date dt1=rightNow.getTime();
        System.out.println("字符串时间："+dt1.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
        timer.scheduleAtFixedRate(myTask1,dt1,2000);
    }
}
