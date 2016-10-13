package com.zkw.string.substing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-26 下午5:46:29
 *
 */
public class SubStringTest {
	static String orderstatus_str = "orderstatus";
	static String orderstatusdesc_str = "orderstatusdesc";
	static String tranamt_str = "tranamt";
	static String merorderno_str = "merorderno";

	private Map<String,String> params2SignStr(Map<String,String> params){
		String orderstatus = params.get(orderstatus_str);
		String orderstatusdesc = params.get(orderstatusdesc_str);
		String tranamt = params.get(tranamt_str);
		String merorderno = params.get(merorderno_str);
		String[] strs = new String[]{"orderstatus","orderstatusdesc","tranamt","merorderno"};
		Arrays.sort(strs);
		String sign = "";
		for(String str : strs) {
			sign +=  str+"="+params.get(str)+"&";
		}
		sign = sign.substring(0,sign.lastIndexOf("&"));
		params.put("sign",sign);
		return params;
	}

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

	/**
	 * 通过for语句截取字符串
	 */
	private static String forSubstring(String name){
		String beanName;
		for(beanName = name; beanName.startsWith("&"); beanName = beanName.substring("&".length())) {
			;
		}
		return beanName;
	}

	//test begin
	private void testParams2SignStr(){
		SubStringTest stringTest = new SubStringTest();
		Map<String,String> params = new HashMap<String, String>();
		params.put(orderstatus_str,"ddd");
		params.put(orderstatusdesc_str,"ccc");
		params.put(tranamt_str,"eee");
		params.put(merorderno_str,"fff");
		params = stringTest.params2SignStr(params);
		System.out.println(params.toString());
	}

	private void testSubBehand(){
		SubStringTest stringTest = new SubStringTest();
		String str = "site_data_20140213";
		String strDay = "site_day_data_20130409";
		String strHour = "site_hour_data_20130603";
		stringTest.subBehand(str);
		stringTest.subBehand(strDay);
		stringTest.subBehand(strHour);
		/**------------------------------------------*/
		stringTest.subFunctionName("duringAfterHappen(0,s)");
		stringTest.getParam("duringAfterHappen(0,s)");
	}

	private static void testForSubstring(){
		System.out.println(forSubstring("&bus&car"));
	}
			
	public static void main(String[] args) {
		testForSubstring();
	}
}
