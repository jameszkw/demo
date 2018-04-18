package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 5:15
 **/

public class PrintString implements Runnable {
    private boolean isConti=true;
    public boolean isConti(){
        return isConti;
    }

    public void setConti(boolean isConti){
        this.isConti=isConti;
    }

    public void printStringMethod(){
        while (isConti==true){
            System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void run() {
        printStringMethod();
    }
}
