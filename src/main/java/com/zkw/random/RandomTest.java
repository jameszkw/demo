package com.zkw.random;

import java.util.Random;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-12 下午4:06:02
 *
 */
public class RandomTest {
	public static void main(String[] args) {
		while(true){
			Random ram=new Random();
			int  number;
			number=Math.abs(ram.nextInt()%2);
			System.out.println(number);
			System.out.println(ram.nextBoolean());
		}
	}
}
