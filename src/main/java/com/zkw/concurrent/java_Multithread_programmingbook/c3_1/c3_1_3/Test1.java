package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3;

/**
 * 出现异常的原因是没有“对象监视器”，也就是没有同步加锁
 *
 * @author James
 * @create 2017-09-10 下午 9:42
 **/

public class Test1 {
    public static void main(String[] args) {
        String newString=new String("");
        try {
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
