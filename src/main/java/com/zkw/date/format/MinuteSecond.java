package com.zkw.date.format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MinuteSecond {
	/**
	 * @todo seven days in the past
	 */
	private static String duration() {
		String rtn = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			int inputDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
			cal.set(Calendar.DAY_OF_YEAR, inputDayOfYear - 7);
			df.format(cal.getTime());
			df.format(System.currentTimeMillis());
			System.out.println(df.format(cal.getTime())+" - "+df.format(System.currentTimeMillis()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtn;
	}

	private void test() {
		SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");
		long begin = System.currentTimeMillis();
		long costTime = System.currentTimeMillis() - begin;
		Date date = new Date(costTime);
		System.out.println(formatter.format(date));
	}

	public static void main(String[] args) {
		duration();
	}
}
