package com.zkw.string.compare;

public class NullTest {
	private void nullString(){
		String yslow = "  ";
		System.out.println(yslow.length());
		if(yslow != null && !yslow.isEmpty()){
			System.out.println("is not null");
		}
	}
	public static void main(String[] args) {
		NullTest test = new NullTest();
		test.nullString();
	}
}
