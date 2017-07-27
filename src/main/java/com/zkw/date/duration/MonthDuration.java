package com.zkw.date.duration;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MonthDuration {
	private String duration() {//need alter
		String rtn = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			int inputDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
			cal.set(Calendar.DAY_OF_YEAR, inputDayOfYear - 7);
			df.format(cal.getTime());
			df.format(System.currentTimeMillis());
			rtn = df.format(cal.getTime())+" - "+df.format(System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(rtn);
		return rtn;
	}
	private void getLastMonth(){
		 Calendar c = Calendar.getInstance();
	        c.add(Calendar.MONTH, -1);
	        System.out.println("上个月是："+new SimpleDateFormat("yyyy/MM").format(c.getTime()));
	}
	public static void main(String[] args) {
		MonthDuration monthDuration = new MonthDuration();
//		monthDuration.duration();
		monthDuration.getLastMonth();
	}
}
