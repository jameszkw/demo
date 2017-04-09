package com.zkw.exception.demo;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class WhoCalled {
    static void f(){
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste:e.getStackTrace()){
                System.out.println(ste.getMethodName());
            }
        }
    }
    public static void main(String[] args) {
        f();
    }
}
