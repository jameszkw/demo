package com.zkw.method;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MethodParamDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月24日 下午8:10:39
 *
 */
public class MethodParamDemo {
	private static String param;
	private static int i;
	private List list = new ArrayList();
	private static Integer in;
	private void method1(String param){
		param = "1";
	}
	private void method2(MethodParamDemo demo){
		demo.param = "2";
	}

	private void method3(List list){
		list.add(0,1);
	}

	private void method4(int i){
		i = 9;
	}

	private void method5(Integer i){
		i=8;
	}

	public static void main(String[] args) {
		MethodParamDemo demo = new MethodParamDemo();
		demo.method1(demo.param);
		System.out.println(demo.param);
		//对象传入方法，不返回
		demo.method2(demo);
		System.out.println(demo.param);
		//list传入方法，不返回
		MethodParamDemo methodParamDemo = new MethodParamDemo();
		demo.method3(methodParamDemo.list);
		System.out.println(methodParamDemo.list.get(0));
		//int传入方法，不返回
		demo.method4(i);
		System.out.println(i);
		//Integer传入方法，不返回
		demo.method5(in);
		System.out.println(in);
	}
}
