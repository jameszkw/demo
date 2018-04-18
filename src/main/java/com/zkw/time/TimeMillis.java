package com.zkw.time;

import java.util.Date;

public class TimeMillis {
	private void timeMillis(){
		Date date =  new Date();
		System.out.println(date.getTime());
	}
		
	public static void main(String[] args) {
		TimeMillis tm = new TimeMillis();
		tm.timeMillis();
	}
}
