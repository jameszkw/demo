package com.zkw.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-6-16 下午12:49:50
 *
 */
public class AtomicIntegerFieldUpdaterDemo {
	
	class DemoData{
	       public volatile int value1 = 1;
	       volatile int value2 = 2;
	       protected volatile int value3 = 3;
	       private volatile int value4 = 4;
	   }
	    AtomicIntegerFieldUpdater<DemoData> getUpdater(String fieldName) {
	        return AtomicIntegerFieldUpdater.newUpdater(DemoData.class, fieldName);
	    }
	    void doit() {
	        DemoData data = new DemoData();
	        System.out.println("1 ==> "+getUpdater("value1").getAndSet(data, 10));
	        System.out.println("2 ==> "+getUpdater("value2").incrementAndGet(data));
	        System.out.println("3 ==> "+getUpdater("value3").decrementAndGet(data));
	        System.out.println("true ==> "+getUpdater("value4").compareAndSet(data, 4, 5));
	    }
	
	public static void main(String[] args) {
		AtomicIntegerFieldUpdaterDemo demo = new AtomicIntegerFieldUpdaterDemo();
		  demo.doit();
	}
}