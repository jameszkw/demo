package com.zkw.math.longdemo;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class RatioLong {
    private static void testRatio(){
        long a = 100000l;
        long b = 234234l;
        float num= (float)a/b;
        System.out.println(num);
        int c =((int)(num*100))%100;
        System.out.println(c);
    }

    public static void main(String[] args) {
        testRatio();
    }
}
