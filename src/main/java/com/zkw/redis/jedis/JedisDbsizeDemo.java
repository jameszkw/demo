package com.zkw.redis.jedis;

import redis.clients.jedis.Jedis;

/**
 * @ClassName: JedisDbsizeDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月15日 上午12:19:28
 *
 */
public class JedisDbsizeDemo {
	private Jedis conn(String ip){
		Jedis jedis = new Jedis(ip);
		return jedis;
	}
	
	private void process(String ip){
		Jedis jedis = conn(ip);
		System.out.println(jedis.dbSize());
	}
	public static void main(String[] args) {
		JedisDbsizeDemo demo = new JedisDbsizeDemo();
		String ip = args[0];
		System.out.println(ip);
		demo.process(ip);
	}
}
