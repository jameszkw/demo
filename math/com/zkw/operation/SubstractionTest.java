package com.zkw.operation;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class SubstractionTest {
    static void substract() {
        long a = 123456l;
        long b = 456l;
        System.out.println("a-b " + (a - b));
        System.out.println("b-a " + (b - a));
        if (b-a<0){
            System.out.println("b<a");
        }
        if (a-b>0){
            System.out.println("a>b");
        }
        float num= (float)(b - a)/a;
        System.out.println(num);
        int c =(int)(num*100);
        System.out.println(c);
    }

    public static void main(String[] args) {
        substract();
    }
}
