package com.zkw.exception.trycatch;


/**
 * @Description:当前方法有catch和throws声明会走当前方法的catch，上一层的catch不会走。
 * @author James.zhang
 * @date 2014-6-7 下午12:03:10
 *
 */
public class TryCatch{
	public static void mothed1() throws Exception{
		System.out.println("method1 up");
		try {
			System.out.println("new Exception");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
			e.printStackTrace();
		}
	}
	public static void method2(){
		try{
			mothed1();
		}catch(Exception ex){
			System.out.println("method2");
			ex.printStackTrace();
			System.out.println("method2");
		}
		System.out.println("outside method2");
	}

	private void method3(){

	}
	public static void main(String[] args) {
		method2();
	}
}
