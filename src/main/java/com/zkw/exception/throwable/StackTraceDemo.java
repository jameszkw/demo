package com.zkw.exception.throwable;

/**
 * @ClassName: StackTraceDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月23日 上午11:30:30
 *
 */
public class StackTraceDemo {
	private void test(){
		StackTraceElement[] stacks = new Throwable().getStackTrace();
		System.out.println(stacks[0]);
		System.out.println(stacks[1]);
		System.out.println(stacks[2]);
	}
	public static void main(String[] args) {
		StackTraceDemo demo = new StackTraceDemo();
		demo.test();
	}
}
