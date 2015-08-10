package com.zkw.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class NonFixExecutor implements Runnable{
	
	public void run() {
		System.out.println("Thread... ...");
	}

	public static void main(String[] args) {
//		ExecutorService service=new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		for(int i = 0;i<20;i++){
			
		}
	}
}
