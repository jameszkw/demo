package com.zkw.concurrent.justest;

public class Thread1 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				Thread.sleep(10000);
				System.out.println("1");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
}
