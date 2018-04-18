package com.zkw.classloader.classdemo;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-08-03 下午 3:39
 **/

public class Chir implements Pa {
    private void getCT(){
        System.out.println(getClass());

    }
    public static void main(String[] args) {
        Chir chir = new Chir();
        chir.getCT();
    }
}
