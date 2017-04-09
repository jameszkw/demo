package com.zkw.time;

import javax.xml.bind.DatatypeConverter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Administrator on 2017/2/27 0027.
 */
public class DayTest {
    public static int dayForWeekISO(String pTime){
        Calendar c = DatatypeConverter.parseDateTime(pTime);
        int dayForWeek = c.get(Calendar.DAY_OF_WEEK);
        return dayForWeek;
    }

    /**
     * 获取上周日期
     * num为推迟的周数，1本周，-1向前推迟一周，2下周，依次类推
     * */
    private static String lastWeek(int week,int n){
        Calendar cal = Calendar.getInstance();
        //n为推迟的周数，1本周，-1向前推迟一周，2下周，依次类推
        String date;

        cal.add(Calendar.DATE, n*7);
        //想周几，这里就传几Calendar.MONDAY（TUESDAY...）
        cal.set(Calendar.DAY_OF_WEEK,week);
        date = new SimpleDateFormat("yyyy.MM.dd").format(cal.getTime());
        return date;
    }

    public static void main(String[] args) {
        System.out.println(dayForWeekISO("2017-02-26T07:54:40.812Z"));
        System.out.println(lastWeek(1,-1));
    }
}
