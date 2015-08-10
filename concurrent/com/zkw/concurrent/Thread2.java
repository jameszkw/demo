package com.zkw.concurrent;

public class Thread2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("2");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
