package com.zkw.string.endWith;

/**
 * Created by Administrator on 2016/7/11 0011.
 */
public class EndWithDemo {

    private static void spaceDemo(){
        String str = "    123";
        System.out.println(str.startsWith(" "));
        System.out.println(str.endsWith(" "));
    }
    public static void main(String[] args) {
        spaceDemo();
    }
}
