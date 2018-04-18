package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_6.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 9:36
 **/

public class Sub extends Main {
    synchronized public void operateISubMethod(){
        while (i>0){
            i--;
            System.out.println("sub print i="+i);
            try {
                Thread.sleep(100);
                this.operateIMainMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
