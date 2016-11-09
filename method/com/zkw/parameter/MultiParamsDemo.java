package com.zkw.parameter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class MultiParamsDemo {
    private static void setParams(String... params){
        for (String str:params){
            System.out.println(str);
        }
    }

    private static void test(){
        setParams("d","s");
        String[] strs = new String[]{"1","2"};
        setParams(strs);

    }
    public static void main(String[] args) {
        test();
    }
}
