package com.enumtest.test;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public class MethodsMain {
    public static void main(String[] args) {
        EnumTest enumTest =EnumTest.TUE;

        //compareTo(E o)
        System.out.println(enumTest.compareTo(EnumTest.MON));
        //getDeclaringClass()
        System.out.println("getDeclaringClass() "+enumTest.getDeclaringClass().getName());
        //name() toString()
        System.out.println("name() "+enumTest.name());
        System.out.println("toString() "+enumTest.toString());
        //ordinal()
        System.out.println("ordinal() "+enumTest.ordinal());
    }
}
