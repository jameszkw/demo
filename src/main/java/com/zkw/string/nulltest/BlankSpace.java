package com.zkw.string.nulltest;

/**
 * @ClassName: BlankSpace
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月11日 下午9:35:58
 *
 */
public class BlankSpace {
	private void test(){
		String str = " ";
		String str1 = "d dd";
		System.out.println(str.contains(" "));
		System.out.println(str1.contains(" "));
	}
	public static void main(String[] args) {
		BlankSpace b = new BlankSpace();
		b.test();
	}
}
