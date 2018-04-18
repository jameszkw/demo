package com.zkw.redis.jedis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * @ClassName: JedisZsetDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月14日 下午4:10:59
 *
 */
public class JedisZsetDemo {
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
	
	private List<String> getFirStrFileToken(String path){
		List<String> rtn = new ArrayList<String>();
		File file = new File(path);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file),5*1024*1024);
			String tempString = null;
			while ((tempString = reader.readLine()) != null)
			{
				// 进行操作.....
				if(!tempString.isEmpty()){
					String key = tempString.substring(0, tempString.indexOf(" "));
					rtn.add(key);
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
	
	private void process(String tokenPath,String icodePath,String ip){
		Jedis jedis = conn(ip);
		long start1 = System.currentTimeMillis(); 
		List<String> keys = getFirStrFileToken(tokenPath);
		int count = 0;
		List<String> mems = getFirStrFileIcode(icodePath);
		for(String key:keys){
			long start2 = System.currentTimeMillis(); 
			System.out.println("key:"+key);
			for(int i = 0;i<10;i++){
				count++;
				jedis.zadd(key, 20, mems.get(count));
			}
		}
		
//		System.out.println("18700267234:"+jedis.zrange("18700267234",0,19));
//		System.out.println("18700267233:"+jedis.zrange("18700267233",0,19));
	}
	public static void main(String[] args) {
		JedisZsetDemo demo = new JedisZsetDemo();
		for(int i=0;i<args.length;i++){
			System.out.print(args[i]+" ");
		}
		String tokenPath = args[0];//token
		String icodePath = args[1];//mem
		String ip = args[2];//ip
		demo.process(tokenPath,icodePath,ip);
	}
}
