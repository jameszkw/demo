package com.zkw.time;

import org.apache.commons.lang3.time.StopWatch;

/**
 * @Description: 提供一个时间片记录
 * @author James.zhang
 * @date 2014-6-19 下午6:07:17
 *
 */
public class StopWatchTest {
	private static void splitTest() throws InterruptedException {
		StopWatch watch = new StopWatch();
		watch.start();
		Thread.sleep(1000);
		watch.split();
		/*
		 * This is the time between start and latest split.
		 * 调用start()方法到最后一次调用split()方法耗用的时间
		 */
		System.out.println(watch.getSplitTime());
		Thread.sleep(2000);
		watch.split();
		System.out.println(watch.getSplitTime());
		Thread.sleep(500);
		watch.stop();
		/*
		 * This is either the time between the start and the moment this method
		 * is called, or the amount of time between start and stop
		 * 调用start()方法到调用getTime()或stop()方法耗用的时间
		 */
		System.out.println(watch.getTime());
	}

	/**
	 * @Description: 重置
	 * @throws InterruptedException
	 */
	private static void resetTest() throws InterruptedException {
		StopWatch watch = new StopWatch();
		watch.start();
		Thread.sleep(1000);
		System.out.println(watch.getTime());
		/* 复位 归零 */
		watch.reset();
		watch.start();
		Thread.sleep(1000);
		System.out.println(watch.getTime());
	}

	/**
	 * @Description: 暂停
	 * @throws InterruptedException
	 */
	private static void suspendTest() throws InterruptedException {
		StopWatch watch = new StopWatch();
		watch.start();
		Thread.sleep(1000);
		System.out.println(watch.getTime());
		/* 暂停 */
		watch.suspend();
		System.out.println("do something");
		Thread.sleep(500);
		/* 恢复 */
		watch.resume();
		Thread.sleep(2000);
		System.out.println(watch.getTime());
	}

	public static void main(String[] args) {
		try {
			splitTest();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
