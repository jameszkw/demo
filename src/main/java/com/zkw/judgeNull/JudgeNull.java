package com.zkw.judgeNull;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-4 下午5:19:29
 *
 */
public class JudgeNull {
	public static void main(String[] args) {
		String str = new String();
		System.out.println(str);
		str.isEmpty();
		if(str != null){
			System.out.println("not null");
			
		}
	}
}
