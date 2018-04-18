package com.zkw.instrumentation;

import java.lang.instrument.Instrumentation;

public class MyAgent {
	public static void premain(String args, Instrumentation inst) {
		System.out.println("myagent is running ... ...");
	    SomeClass obj = new SomeClass();
	    long size = inst.getObjectSize(obj);
	    System.out.println("Bytes used by object: " + size);
	  }
}
