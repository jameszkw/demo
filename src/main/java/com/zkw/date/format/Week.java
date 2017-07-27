package com.zkw.date.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Week {
	
	private void hour(){
		Date date = new Date();
//		date.setHours(1);
		SimpleDateFormat df = new SimpleDateFormat("k");
		System.out.println(df.format(date.getTime()));
	}
	private String patition(){
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-ww-kk");
		String dateStr = df.format(date.getTime()- 4 * 24 * 60 * 60 * 1000);
		String year = dateStr.substring(0, 4);
		String month = dateStr.substring(5, 7);
		String week = dateStr.substring(11, 13);
		String day = dateStr.substring(8, 10);
		return "/year="+year+"/month="+month+"/week="+week+"/day="+day+"/";
	}
	public static void main(String[] args) {
		Week w = new Week();
//		System.out.println(w.patition());
//		System.out.println(new Date().getTime());
		
		w.hour();
	}
}
