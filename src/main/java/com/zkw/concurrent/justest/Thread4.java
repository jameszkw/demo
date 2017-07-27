package com.zkw.concurrent.justest;

public class Thread4 implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("4");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
