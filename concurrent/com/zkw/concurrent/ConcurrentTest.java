package com.zkw.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ConcurrentTest {
	private void orderTest(){
		try {
			ExecutorService exec = null;
			exec = Executors.newFixedThreadPool(5);
			exec.execute(new Thread1());
			exec.execute(new Thread2());
			exec.execute(new Thread3());
			exec.execute(new Thread4());
			
			exec.shutdown();
			while(!exec.isTerminated()){
				Thread.currentThread().sleep(10);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ConcurrentTest ct = new ConcurrentTest();
		ct.orderTest();
	}
}
