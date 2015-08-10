package com.zkw.nio.selector;

import java.io.IOException;
import java.nio.channels.Selector;

public class SelectorTest {
	private void test(){
		try {
			Selector selector = Selector.open();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		
	}
}
