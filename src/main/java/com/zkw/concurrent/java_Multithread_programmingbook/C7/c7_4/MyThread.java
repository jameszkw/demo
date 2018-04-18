package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 8:37
 **/

public class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf,String dateString) {
        this.sdf = sdf;
        this.dateString=dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef=sdf.parse(dateString);
            String newDateString=sdf.format(dateRef).toString();
            if (!newDateString.equals(dateString)){
                System.out.println("threadname="+this.getName()+"报错了 日期字符串："+dateString+" 转换成的日期为："+newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
