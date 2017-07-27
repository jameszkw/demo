package com.zkw.method;

public class LocalVariable {
	private void method(int i){
		System.out.println(i);
		i++;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable();
		int i = 3;
		lv.method(i);
		System.out.println(i);
	}
}
