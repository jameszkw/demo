package com.zkw.ajustest;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-04 下午 2:12
 **/

public class TestFinal {
    public void test(){
        final int a=10;
        new InnerClass(){
            @Override
            public void display() {
                System.out.println(a);
            }
        };
    }
    public static void main(String[] args) {

    }
}
