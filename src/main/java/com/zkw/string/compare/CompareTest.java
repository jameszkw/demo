package com.zkw.string.compare;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-7-16 下午7:55:12
 *
 */
public class CompareTest {
	
	private void comNumber(){
		String one = "13";
		String four ="4";
		System.out.println(one.compareTo(four));
		System.out.println(four.compareTo(one));
	}
	public static void main(String[] args) {
		  
		  CompareTest compareTest = new CompareTest();
		  compareTest.comNumber();
	}
}
