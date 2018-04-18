package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_14;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 9:15
 **/

public class DBTools {
    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA == true) {
                wait();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("11111");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (prevIsA == false) {
                wait();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("00000");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
