package com.zkw.date.iso8601;

import org.elasticsearch.common.joda.time.format.DateTimeFormatter;
import org.elasticsearch.common.joda.time.format.ISODateTimeFormat;

import javax.xml.bind.DatatypeConverter;
import java.text.DateFormat;
import java.text.ParseException;
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

    /**
     * 将ISO8601字符串转换为Date
     * */
    public static void ISO8601ToDate(String ISO8601) {
        Calendar calendar1 = DatatypeConverter.parseDateTime(ISO8601);
        System.out.println(calendar1.getTime().getTime());
    }

    /**
     * 计算两个日期之间相差的天数
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(Date smdate,Date bdate) throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        smdate=sdf.parse(sdf.format(smdate));
        bdate=sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);

        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     *字符串的日期格式的相差的天数
     */
    public static int daysBetween(String smdate,String bdate) throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(smdate));
        long time1 = cal.getTimeInMillis();
        cal.setTime(sdf.parse(bdate));
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);

        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     *ISO9801的日期格式的相差的天数
     */
    public static int daysBetweenISO(String smdate,String bdate){
        Calendar calendar1 = DatatypeConverter.parseDateTime(smdate);
        long time1 = calendar1.getTimeInMillis();
        calendar1 = DatatypeConverter.parseDateTime(bdate);
        long time2 = calendar1.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }


    /**
     * 增加一天
     */
    public static void getDateStr(String date,int num){
        Calendar calendar1 = DatatypeConverter.parseDateTime(date);
        calendar1.add(Calendar.DATE, num);//增加一天
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println(simpleDateFormat.format(calendar1.getTime().getTime()));
        System.out.println(calendar1.getTime().getTime());
    }




    private static void test() {
        DateTimeFormatter parser2 = ISODateTimeFormat.dateTimeNoMillis();
        String jtdate = "2016-12-29T09:09:45.296Z";
        System.out.println(parser2.parseDateTime(jtdate));

    }

    /**
     * 比较时间的大小
     * */
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

    /**
     * 判断当前日期是星期几
     *
     * @param pTime 修要判断的时间
     * @return dayForWeek 判断结果
     * @Exception 发生异常
     */
    public static int dayForWeek(String pTime) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(format.parse(pTime));
        int dayForWeek = 0;
        if(c.get(Calendar.DAY_OF_WEEK) == 1){
            dayForWeek = 7;
        }else{
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }

    /**
     * 判断当前日期是星期几
     *
     * @param pTime 修要判断的时间
     * @return dayForWeek 判断结果
     * @Exception 发生异常
     */
    public static int dayForWeekISO(String pTime) throws Exception {
        Calendar c = DatatypeConverter.parseDateTime(pTime);
        int dayForWeek = 0;
        if(c.get(Calendar.DAY_OF_WEEK) == 1){
            dayForWeek = 7;
        }else{
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }

    public static int dayForWeekISOOri(String pTime){
        Calendar c = DatatypeConverter.parseDateTime(pTime);
        int dayForWeek = 0;
        dayForWeek = c.get(Calendar.DAY_OF_WEEK);
        return dayForWeek;
    }

    /**
     * 获取上周日期
     * */
    private static void lastWeek(){
        Calendar cal = Calendar.getInstance();
        //n为推迟的周数，1本周，-1向前推迟一周，2下周，依次类推
        int n = -1;
        String monday;

        cal.add(Calendar.DATE, n*7);
        //想周几，这里就传几Calendar.MONDAY（TUESDAY...）
        cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        monday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
        System.out.println(monday);
    }



    private void testDaysBetween(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1= null;
        try {
            d1 = sdf.parse("2016-12-30 10:10:10");
            Date d2=sdf.parse("2017-01-02 00:01:00");
            System.out.println(daysBetween(d1,d2));

            System.out.println(daysBetween("2012-09-08 10:10:10","2012-09-15 00:00:00"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void testDaysBetweenISO(){
        System.out.println(daysBetweenISO("2016-12-28T10:20:54.100Z","2016-12-30T10:20:56.107Z"));
    }

    public static void main(String[] args) {
//        System.out.println(getISO8601Timestamp(new Date()));
//        test();
//        String iso8601 = "2016-12-29T09:09:45.296Z";
//        ISO8601ToDate(iso8601);
//        testDaysBetweenISO();
//        getDateStr("2016-12-28",1);
        try {
//            System.out.println(dayForWeek("2016-12-30"));
//            System.out.println(dayForWeekISO("2016-12-30T03:11:39.383Z"));
            System.out.println(dayForWeekISOOri("2016-12-30T03:11:39.383Z"));
//            lastWeek();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
