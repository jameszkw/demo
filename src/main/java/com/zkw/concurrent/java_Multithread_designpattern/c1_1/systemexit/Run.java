package com.zkw.concurrent.java_Multithread_designpattern.c1_1.systemexit;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 10:32
 **/

public class Run {
    public static void main(String[] args) {
        Target target=new Target();
        Thread t=new Thread(target);
        t.start();
        try {

            System.exit(0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
