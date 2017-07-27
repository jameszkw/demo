package com.zkw.math.parse;

/**
 * Created by Administrator on 2016/7/19 0019.
 */
public class NumberParse {
    private static void longParseDemo(){
        try {
            String str="-80311583638";
            Long.parseLong(str);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        longParseDemo();
    }
}
