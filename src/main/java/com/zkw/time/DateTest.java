package com.zkw.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public long fromDateStringToLong(String inVal) { // 此方法计算时间毫秒
		Date date = null; // 定义时间类型
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-mm-dd hh:ss");
		try {
			date = inputFormat.parse(inVal); // 将字符型转换成日期型
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date.getTime(); // 返回毫秒数
	}

	private static String dqsj() { // 此方法用于获得当前系统时间（格式类型2007-11-6 15:10:58）
		Date date = new Date(); // 实例化日期类型
		String today = date.toLocaleString(); // 获取当前时间
		System.out.println("获得当前系统时间 " + today); // 显示
		return today; // 返回当前时间
	}

	public static void main(String[] args) {
		String dqsj = dqsj(); // 获得String dqsj = dqsj(); //获得当前系统时间
		DateTest df = new DateTest(); // 实例化方法

		long startT = df.fromDateStringToLong("2005-03-03 14:51:23"); // 定义上机时间
		long endT = df.fromDateStringToLong("2004-03-03 13:50:23"); // 定义下机时间

		long ss = (startT - endT) / (1000); // 共计秒数
		int MM = (int) ss / 60; // 共计分钟数
		int hh = (int) ss / 3600; // 共计小时数
		int dd = (int) hh / 24; // 共计天数

		System.out.println("共" + dd + "天 准确时间是：" + hh + " 小时 " + MM + " 分钟"
				+ ss + " 秒 共计：" + ss * 1000 + " 毫秒");

	}
}
