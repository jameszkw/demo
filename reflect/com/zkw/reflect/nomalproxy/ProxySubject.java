package com.zkw.reflect.nomalproxy;

public class ProxySubject extends Subject {
	private RealSubject realSubject;
	public ProxySubject() {
		// TODO Auto-generated constructor stub
	}
	
	public void request(){
		prerequest();
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();
		postrequest();
	}
	
	private void prerequest(){
		
	}
	private void postrequest(){
		
	}
}
