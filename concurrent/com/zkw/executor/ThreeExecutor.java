package com.zkw.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreeExecutor {
	private void process(){
		List<String> list = new ArrayList<String>();
		ExecutorService exe = Executors.newFixedThreadPool(3);
		exe.execute(new One(list));
		exe.execute(new Two());
		exe.execute(new Three());
		exe.shutdown();
		while(!exe.isTerminated()){
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		ThreeExecutor threeExecutor = new ThreeExecutor();
		threeExecutor.process();
	}
}
