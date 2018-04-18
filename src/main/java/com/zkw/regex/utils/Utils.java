package com.zkw.regex.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/11/9 0009.
 * 正则工具类
 */
public class Utils {
    private final Logger log = LogManager.getLogger(this.getClass());
    /**
     * 获取占位符中的内容
     */
    private void placeholder(){
        //        String filetext = "";
        String filetext = "8*q#1jjjj5#q+i-5*(q#6#q-3)";
        Pattern p = Pattern.compile("\\#(.*?)\\#");//正则表达式，取q#和#q之间的字符串，不包括q#和#q
        Matcher m = p.matcher(filetext);
        while(m.find()) {
            System.out.println(m.group(1));//m.group(1)不包括这两个字符
        }
    }
}
