package com.zkw.charbase;

/**
 * Created by Administrator on 2016/5/26 0026.
 * illustrate: char test
 */
public class CharTest {
    public static void main(String[] args) {
        //直接指定单个字符作为字符常量
        char c1='a';
        //使用转义字符作为字符常量
        char c2='\n';
        //使用Unicode编码值来作为字符常量
        char c3='\u9999';
        System.out.println(c3);
        //定义一个中字符常量
        char c4='中';
        //直接将一个char变量当成int变量类型使用
        int i=c4;
        System.out.println(c4);
        //直接将一个0--65535的int型整数赋值给一个char变量
        char c=0;
        System.out.println(":"+c+":");
    }
}
