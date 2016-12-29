package com.zkw.iso8601;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.elasticsearch.common.joda.time.format.DateTimeFormatter;
import org.elasticsearch.common.joda.time.format.ISODateTimeFormat;

import javax.xml.bind.DatatypeConverter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class Test {
    /**
     * 传入Data类型日期，返回字符串类型时间（ISO8601标准时间）
     *
     * @param date
     * @return
     */
    public static String getISO8601Timestamp(Date date) {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(tz);
        String nowAsISO = df.format(date);
        return nowAsISO;
    }

    private static void test() {
        String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        System.out.println(DateFormatUtils.format(new Date(), pattern));
        //转回来的时候使用：

//        DateTimeFormatter parser2 = ISODateTimeFormat.dateTimeNoMillis();
        DateTimeFormatter parser2 = ISODateTimeFormat.basicDateTime();
        String jtdate = "2010-01-01T12:00:00+01:00";
//        String jtdate = "2016-12-23T09:05:49.277Z";
        System.out.println(parser2.parseMillis(jtdate));

    }

    public static int compareDate(Date d1, Date d2) {
        if (d1.getTime() > d2.getTime()) {
            System.out.println("d1大于d2");
            return 1;
        } else if (d1.getTime() < d2.getTime()) {
            System.out.println("d1小于d2");
            return -1;
        } else {//相等
            return 0;
        }
    }


    public static void main(String[] args) {
//        System.out.println(getISO8601Timestamp(new Date()));
//        test();
        Calendar calendar1 = DatatypeConverter.parseDateTime("2012-01-01T12:00:00+01:00");
        calendar1.getTime().getTime();
        Calendar calendar2 = DatatypeConverter.parseDateTime("2011-01-01T12:00:00+01:00");
        calendar2.getTime().getTime();
        compareDate(calendar1.getTime(), calendar2.getTime());
    }
}
