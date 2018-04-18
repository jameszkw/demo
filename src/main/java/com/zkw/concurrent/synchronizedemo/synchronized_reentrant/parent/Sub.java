package com.zkw.concurrent.synchronizedemo.synchronized_reentrant.parent;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 11:16
 **/

public class Sub extends Main {
    synchronized public void operateISubMethod(){
        while (i>0){
            try {
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                operateIMainMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
