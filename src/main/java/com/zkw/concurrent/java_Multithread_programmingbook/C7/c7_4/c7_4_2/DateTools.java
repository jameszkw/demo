package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_4.c7_4_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 8:49
 **/

public class DateTools {
    public static Date parse(String formatPattern,String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern,Date date){
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }
}
