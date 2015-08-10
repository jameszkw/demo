package com.zkw.reflect.nomalproxy;

public class RealSubject extends Subject {
	
	public RealSubject() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("From real subject.");
	}
	
	
}
