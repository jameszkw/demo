package com.zkw.concurrent.java_Multithread_programmingbook.C5.c5_1_4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 延迟指定毫秒，然后在以某一时间间隔循环执行任务。
 * */
public class Run {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task=new MyTask();
        Timer timer=new Timer();
        System.out.println("当前时间："+new Date().toLocaleString());
        timer.schedule(task,3000,5000);
    }
}
