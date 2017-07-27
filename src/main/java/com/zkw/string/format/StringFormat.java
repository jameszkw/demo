package com.zkw.string.format;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-8 下午5:04:04
 *
 */
public class StringFormat {
	public static void main(String[] args) {
		int mId = 12;
		String mIdFormat = String.format("MT%04d", mId);
		System.out.println(mIdFormat);
	}
}
