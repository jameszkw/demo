package com.zkw.date.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-5 上午10:39:50
 *
 */
public class DateUtils {
	/**
	 * @Description: Date转换为毫秒
	 * @author James.zhang
	 * @date 2014-5-5 上午10:41:47
	 */
	public static int getDateInt() {
		Date date = new Date();
		int dateInt = (int) (date.getTime() / 1000);
		return dateInt;
	}
	
	/**
	 * @Description: 毫秒转换为Date
	 * @author James.zhang
	 * @date 2014-5-5 上午10:41:50
	 */
	public static Date getDateByInt(int dateInt) {
		Date currDate = new Date(((long) dateInt) * 1000L);
		return currDate;
	}
	
	/**
	 * @Description: 毫秒转换为Date
	 * @author James.zhang
	 * @date 2014-5-7 下午2:11:01
	 */
	public static Date millisTurnDate(long millis){
		Date currDate = new Date(millis);
		return currDate;
	}
	/**
	 * 时间加减方法一
	 * */
	public static String tomorrow1(){
		Date date=new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
		date=calendar.getTime(); //这个时间就是日期往后推一天的结果
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(date);
		return dateString;
	}

	/**
	 * 时间加减方法一
	 * */
	public static void tomorrow2(){
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("今天的日期："+df.format(d));
		System.out.println("两天前的日期：" + df.format(new Date(d.getTime() - 2 * 24 * 60 * 60 * 1000)));
		System.out.println("三天后的日期：" + df.format(new Date(d.getTime() + 3 * 24 * 60 * 60 * 1000)));
	}


	public static void main(String[] args) {
//		System.out.println(getDateByInt(1399442729358));
		Date date = new Date();
		System.out.println(date.getTime());
//		System.out.println(millisTurnDate(Long.parseLong("1401423929206")));
		System.out.println(tomorrow1());
		tomorrow2();
	}
}
