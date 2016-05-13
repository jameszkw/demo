package com.zkw.stringBuilder;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class MethodMain {
    private static void newDemo(){
        StringBuilder sb=new StringBuilder(2);
        sb.append(1);
        sb.append(2);
        sb.append(3);
    }
    private void reverseMethod(){
        System.out.println(new StringBuilder("adc").reverse());

    }
    public static void main(String[] args) {
        newDemo();
    }
}
