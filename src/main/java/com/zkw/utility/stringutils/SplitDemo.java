package com.zkw.utility.stringutils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2016/7/5 0005.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str="d,3";
        String[] strs = StringUtils.split(str,",");
        for (String tem:strs){
            System.out.println(tem);
        }
    }
}
