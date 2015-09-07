package com.zkw.parameter;

/**
 * @ClassName: MethodParamDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月24日 下午8:10:39
 *
 */
public class MethodParamDemo {
	private String param;
	private String method1(String param){
		param = "1";
		return param;
	}
	private void method2(String param){
		param = "2";
	}
	private void method3(String param){
		param = "3";
	}
	
	public static void main(String[] args) {
		MethodParamDemo demo = new MethodParamDemo();
		demo.param = demo.method1(demo.param);
		System.out.println(demo.param);
	}
}
