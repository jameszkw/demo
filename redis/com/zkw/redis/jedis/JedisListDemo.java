package com.zkw.redis.jedis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * @ClassName: JedisListDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月15日 上午2:08:05
 *
 */
public class JedisListDemo {
	private Jedis conn(String ip){
		Jedis jedis = new Jedis(ip);
		return jedis;
	}
	
	public List<String> getFirStrFileIcode(String filename) {
		List<String> rtn = new ArrayList<String>();
		File file = new File(filename);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file),5*1024*1024);
			String tempString = null;
			while ((tempString = reader.readLine()) != null)
			{
				// 进行操作.....
				if(!tempString.isEmpty()){
					String mem = tempString.substring(0, tempString.indexOf(","));
					rtn.add(mem);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null)
			{
				try {
					reader.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		return rtn;
	}
	
	private void process(String icodePath,String ip){
		Jedis jedis = conn(ip);
		
		List<String> keys = getFirStrFileIcode(icodePath);
		int count = 0;
		for(int j = 1;j<10;j++){
			String key = "laxin:renmai:winners:queue:00"+j;
			for(int i = 0;i<100;i++){
				count++;
				String mobile = keys.get(count);
				jedis.lpush(key, mobile);
			}
			System.out.println(key);
		}
	}
	
	public static void main(String[] args) {
		JedisListDemo demo = new JedisListDemo();
		String ip = args[0];
		String icodePath = args[1];
		
		demo.process(icodePath,ip);
	}
}
