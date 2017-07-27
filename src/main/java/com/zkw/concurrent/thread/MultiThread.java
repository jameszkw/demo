package com.zkw.concurrent.thread;

/**
 * @ClassName: Facade
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月14日 下午4:08:28
 *
 */
public class MultiThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
	
}
