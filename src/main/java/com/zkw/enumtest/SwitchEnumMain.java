package com.zkw.enumtest;

/**
 * Created by Administrator on 2016/5/2 0002.
 * 1.遍历枚举 2.switch枚举
 */
public class SwitchEnumMain {
    public static void main(String[] args) {
        //1
        for (EnumTest e: EnumTest.values()){
            System.out.println(e.toString());
        }
        System.out.println("------------我是分割线------------------");
        //2
        EnumTest enumTest = EnumTest.MON;
        switch (enumTest){
            case MON:
                System.out.printf("今天是星期一");
                break;
            case THU:
                System.out.printf("今天是星期e二");
                break;
        }
    }
}
