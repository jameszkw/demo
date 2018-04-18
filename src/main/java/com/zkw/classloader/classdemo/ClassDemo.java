package com.zkw.classloader.classdemo;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-08-03 下午 3:35
 **/

public class ClassDemo {
    private void getclassT(){
        System.out.println(getClass());
    }

    public static void main(String[] args) {
        ClassDemo demo = new ClassDemo();
        demo.getclassT();
    }
}
