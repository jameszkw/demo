package com.zkw.whilecount;

/**
 * @ClassName: CountTest
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月27日 下午5:40:43
 *
 */
public class CountTest {
	private void test(){
		int count = 0;
		while(count<3){
			count++;
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		CountTest test = new CountTest();
		test.test();
	}
}
