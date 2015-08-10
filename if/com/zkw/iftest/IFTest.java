package com.zkw.iftest;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-29 下午1:46:56
 *
 */
public class IFTest {
	public static void main(String[] args) {
		String str = "8";
		if(str.equals("8")) {
			System.out.println("8");
		} else if(str.equals("7") || str.equals("9")) {
			System.out.println("79");
		} else {
			System.out.println("8");
		}
	}
}
