package com.zkw.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ContainTest {
	private void containTest(){
		BlockingQueue<String> tQ = new LinkedBlockingQueue<String>();
		tQ.add("oral");
		if(tQ.contains("present")){
			System.out.println("present");
		}
	}
	public static void main(String[] args) {
		ContainTest ct = new ContainTest();
		ct.containTest();
	}
}
