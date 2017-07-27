package com.zkw.syntax.andortest;

public class AndOrTest {
	public static void main(String[] args) {
		String str1 = "1";
		String str2 = "2";
		if(str1.equals("0") || str2.equals("2")){
			System.out.println("||");
		}
		if(str1.equals("1") && str2.equals("2")){
			System.out.println("&&");
		}
	}
}
