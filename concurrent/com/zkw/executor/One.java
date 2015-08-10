package com.zkw.executor;

import java.util.List;

public class One implements Runnable {
	private List<String> list;
	public One(List<String> list) {
		this.list = list;
	}
	public void run() {
		list.add("fuck");
		System.out.println("one ... ...");
	}

}
