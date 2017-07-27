package com.zkw.string.nulltest;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-6-28 下午12:20:18
 *
 */
public class IsEmptyTest {
	private void stringNullTest(){
		String str = null;
		if(str != null && str.equals("5")){
			System.out.println(str);
		}
	}
	private static boolean isBlankString(String value) {
		return value == null || "".equals(value.trim());
	}
	
	public static void main(String[] args) {
		String str = " ";
		System.out.println("fff"+str+"fff");
		System.out.println("fff"+str.trim()+"fff");
		System.out.println(str.equals(" "));
		System.out.println(str.isEmpty());
		isBlankString(str);

		System.out.println(str.length());
		System.out.println(str.equals(""));
	}
}
