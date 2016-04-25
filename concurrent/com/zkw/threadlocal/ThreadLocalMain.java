package com.zkw.threadlocal;

/**
 * Created by Administrator on 2016/4/24 0024.
 */
public class ThreadLocalMain {

    private void test() {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("string");
        System.out.println(threadLocal.get());
    }

    private void initTest(){
        ThreadLocal threadLocal = new ThreadLocal(){
            @Override
            protected Object initialValue() {
                return "init value";
            }
        };
        System.out.println(threadLocal.get());
    }

    public static void main(String[] args) {
        ThreadLocalMain main = new ThreadLocalMain();
        main.test();
        main.initTest();
    }

}
