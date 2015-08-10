package com.zkw.DateUtils;

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
	
	public static void main(String[] args) {
//		System.out.println(getDateByInt(1399442729358));
		Date date = new Date();
		System.out.println(date.getTime());
//		System.out.println(millisTurnDate(Long.parseLong("1401423929206")));
	}
}
