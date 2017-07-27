package com.zkw.concurrent.justest;

public class Thread3 implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("3");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
