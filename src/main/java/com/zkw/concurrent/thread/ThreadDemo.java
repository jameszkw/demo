package com.zkw.concurrent.thread;

/**
 * @ClassName: ThreadDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月14日 下午4:07:48
 *
 */
public class ThreadDemo {
	
	public static void main(String[] args) {
		for(int i = 0;i<2;i++){
			Thread thread = new Thread(new MultiThread());
			thread.start();
		}
	}
}
