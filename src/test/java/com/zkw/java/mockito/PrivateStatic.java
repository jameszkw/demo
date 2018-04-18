package com.zkw.java.mockito;

import java.util.Calendar;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-17 下午 3:17
 **/

public class PrivateStatic {
    public static boolean webchatEnable(String language){
        System.out.println("webchatEnable");
        return false;
    }

    public static String getWebChatPages(String language){
        System.out.println("getWebChatPages");
        return "getWebChatPages";
    }

    private static boolean webchatInHours(){
        System.out.println("webchatInHours");
        return false;
    }

    private static boolean webchatLanguageEnable(String language){
        System.out.println("webchatLanguageEnable");
        return false;
    }

    private static Calendar getCurrentTime(){
        return Calendar.getInstance();
    }
}
