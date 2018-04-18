package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-05 下午 9:27
 **/

public class HasSelfPrivateNum {
    public void addI(String username){
        int num = 0;
        if (username.equals("a")){
            num = 100;
            System.out.println("a set over!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            num = 200;
            System.out.println("b set over!");
        }
    }
}
