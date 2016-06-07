package com.zkw.bitoperation;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public class BitOperation {

    private static void test(){
        int number = -2;
        //原始数二进制
        printInfo(number);
        number = number << 1;
        //左移一位
        printInfo(number);
        number = number >> 1;
        //右移一位
        printInfo(number);

        number = number >>> 1;
        //无符号右移一位
        printInfo(number);
    }

    /**
     * 输出一个int的二进制数
     * @param num
     */
    private static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num));
    }

    public static void main(String[] args) {
        test();
    }
}
