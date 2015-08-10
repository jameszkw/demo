package com.zkw.randomTest;

import java.util.Random;

/**
 * @Description: range from integer 0-4 
 * @author James.zhang
 * @date 2014-9-3 下午1:47:17
 *
 */
public class Random5Range {
	public static void main(String[] args) {
		while(true){
			Random r = new Random();
			int monitorId = r.nextInt(4)+999;
			System.out.println(monitorId);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
