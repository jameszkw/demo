package com.zkw.classtest;


/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-9-1 下午2:09:29
 *
 */
public class TestSimpleName {
	private String str1;
	public void method1(){
		
	}
	
	public static void main(String[] args) {
		System.out.println(TestSimpleName.class);
		System.out.println(TestSimpleName.class.getSimpleName());
		System.out.println(TestSimpleName.class.getName());
		System.out.println(TestSimpleName.class.getCanonicalName());
		System.out.println(TestSimpleName.class.getTypeName());
	}
}
