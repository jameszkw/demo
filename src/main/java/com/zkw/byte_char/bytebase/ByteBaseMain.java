package com.zkw.byte_char.bytebase;

/**
 * byte 8 bits -128 - + 127
 * 1 bit = 1 二进制数据
 * 1 byte = 8 bit
 * 1 字母 = 1 byte = 8 bit(位)
 * 1 汉字 = 2 byte = 16 bit
 */
public class ByteBaseMain {
    public static void main(String[] args) {
        byte b1=127;
        byte b2=-128;
        byte b3='a';
        byte b4='A';

        byte b5='1';
        char c1='大';
        byte b6='\n';
        System.out.println(b1);
        System.out.println(b3);
        System.out.println(c1);
    }
}
