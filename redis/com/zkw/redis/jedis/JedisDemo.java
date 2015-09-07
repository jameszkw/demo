/**
 * 
 */
package com.zkw.redis.jedis;

import redis.clients.jedis.Jedis;

/**
 * @ClassName: JedisDemo
 * @Description: connect to redis
 * @author James.zhang
 * @date 2015年8月19日 下午11:10:23
 *
 */
public class JedisDemo {
	public static void main(String[] args) {
		//Connecting to Redis on localhost

		  Jedis jedis = new Jedis("10.0.3.66");

		  //adding a new key

		  jedis.set("key", "value");

		  //getting the key value

		  System.out.println(jedis.get("key"));

	}
}
