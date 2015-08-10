package com.zkw.classtest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetAllMethods {
	
	private void getMethods(Class clazz){
		Method[] mes = clazz.getMethods();
		for(Method me : mes){
			System.out.println(me.getName());
		}
	}
	
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("com.zkw.classtest.TestSimpleName");// 根据类名获得其对应的Class对象
																			// 写上你想要的类名就是了
																			// 注意是全名
																			// 如果有包的话要加上
																			// 比如java.Lang.String
			GetAllMethods getAllMethods = new GetAllMethods();
			getAllMethods.getMethods(clazz);
			
			
			Field[] fields = clazz.getDeclaredFields();// 根据Class对象获得属性 私有的也可以获得
			for (Field f : fields) {
				System.out.println(f.getType().getName());// 打印每个属性的类型名字
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
