/**
 * 
 */
package com.zkw.string.util;

/**
 * @ClassName: StringUtils
 * @Description: utils of String
 * @author James.zhang
 * @date 2015年8月8日 上午11:02:17
 *
 */
public class StringUtils {
	String str;
	/**
	 * @Description: 判断是否为空格字符串或无值
	 * @param value
	 * @return
	 */
	private static boolean isBlankString(String value) {
		return value == null || "".equals(value.trim());
	}
	
	/**
	 * @Description: 判断是否有值,包括空格
	 * @param value
	 * @return
	 */
	public static boolean isEmptyString(String value){
		return value == null || value.isEmpty();
	}
	
	public static void main(String[] args) {
		String str = "";
		System.out.println(isBlankString(str));
		System.out.println(isEmptyString(str));
	}
}
