package com.zkw.classtest;

public class Foo {
	private String msg;

    public Foo(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void outInfo() {
        System.out.println("这是测试Java反射的测试类");
    } 
}
