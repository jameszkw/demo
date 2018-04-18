package com.zkw.brace;

/**
 * @Description: what's the {}
 * @author James.zhang
 * @date 2014-6-9 下午5:13:50
 *
 */
public class BraceTest {
	static{
		System.out.println("static");
		System.setProperty("Property1", "1");
	}
	
	{
		System.out.println("{}");
	}
	public BraceTest() {
		System.out.println("com.zkw.brace.BraceTest");
	}
	public static void main(String[] args) {
		
		BraceTest braceTest1 = new BraceTest();
		BraceTest braceTest2 = new BraceTest();
		BraceTest braceTest3 = new BraceTest();
		BraceTest braceTest4 = new BraceTest();
		
	}
}
