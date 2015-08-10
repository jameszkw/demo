package com.zkw.classtest;

import java.lang.reflect.Method;

public class LunchMethod {
	private void lunchMethod(){
		try {
			Foo foo = new Foo("这个一个Foo对象！");
			Class clazz = foo.getClass();
			Method m1 = clazz.getDeclaredMethod("outInfo");
			Method m2 = clazz.getDeclaredMethod("setMsg", String.class);
			Method m3 = clazz.getDeclaredMethod("getMsg");
			m1.invoke(foo);
			m2.invoke(foo, "重新设置msg信息！");
			String msg = (String) m3.invoke(foo);
			System.out.println(msg); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		LunchMethod lm =  new LunchMethod();
		lm.lunchMethod();
	}
}
