package com.zkw.algorithm.justest;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-10 下午 3:13
 **/

public class Recursion {

    /**
     * 5的阶乘--普通实现
     */
    private static void factorial5(){
        int result = 1;
        for (int i=1;i<6;i++){
            System.out.println("阶乘："+result+"*"+i);
            result = result*i;
            System.out.println("阶乘结果："+result);
        }
    }
    /**
     * 99乘法表-递归实现
     */
    private static void multiplicationTable99(){
        System.out.println("begin... ...");
        for (int i=1;i<10;i++){
            System.out.println("test: "+i);
            for (int j=1;j<10;j++){
                System.out.println("result: "+i+"*"+j);
            }
        }
        System.out.println("finish... ...");
    }

    public static void main(String[] args) {
//        multiplicationTable99();
        factorial5();
    }
}
