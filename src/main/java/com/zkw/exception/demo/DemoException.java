package com.zkw.exception.demo;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class DemoException extends Exception {
    public DemoException() {
        super();
    }

    public DemoException(String message) {
        super(message);
    }

    private void test(){
        sec();
    }

    private void sec(){
        System.out.println("sec");
        throw new IllegalArgumentException("错误的参数");
    }


    public static void main(String[] args) {
        DemoException demoException=new DemoException();
        demoException.test();
    }
}
