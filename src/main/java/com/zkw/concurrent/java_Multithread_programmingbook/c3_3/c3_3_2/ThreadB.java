package com.zkw.concurrent.java_Multithread_programmingbook.c3_3.c3_3_2;

import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 8:58
 **/

public class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            if (Tools.t1.get()==null){
                Tools.t1.set(new Date());
            }
            System.out.println("B "+Tools.t1.get().getTime());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
