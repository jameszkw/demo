package com.zkw.whiletest.whilebreak;

public class BreakTest {
	public static void main(String[] args) {
		int i = 0;
		while(true){
			System.out.println("outer begin......");
			while(true){
				System.out.println("inner......"+i++);
				if(i==3){
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("outer......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
