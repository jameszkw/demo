package com.zkw.string.substing;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-26 下午5:46:29
 *
 */
public class SubStringTest {
	private void subBehand(String str){
		str = str.substring(0, str.length()-9);
		System.out.println(str);
	}
	
	private void nomal(){
		String resultStr = "rtt min/avg/max/mdev = 37.517/42.668/49.426/5.045 ms";
		
		String timeStr = resultStr.substring(resultStr.lastIndexOf("=")+1).trim();
		String[] times = timeStr.split("/");
		
		System.out.println(times[0]);
		System.out.println(times[1]);
		System.out.println(times[2]);
	}
	
	private void subFunctionName(String function){
		try {
			System.out.println(function.substring(0,function.indexOf("(")));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String[] getParam(String function){
		String[] params = null;
		try {
			String paramStr = function.substring(function.indexOf("(")).replace("(", "").replace(")", "");
			params = paramStr.split(",");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return params;
	}
			
	public static void main(String[] args) {
		SubStringTest stringTest = new SubStringTest();
//		String str = "site_data_20140213";
//		String strDay = "site_day_data_20130409";
//		String strHour = "site_hour_data_20130603";
//		stringTest.subBehand(str);
//		stringTest.subBehand(strDay);
//		stringTest.subBehand(strHour);
		stringTest.subFunctionName("duringAfterHappen(0,s)");
		stringTest.getParam("duringAfterHappen(0,s)");
	}
}
