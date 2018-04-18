package com.zkw.redis.jedis2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import redis.clients.jedis.Jedis;

import com.zkw.concurrent.justest.Thread1;
import com.zkw.concurrent.justest.Thread2;
import com.zkw.concurrent.justest.Thread3;
import com.zkw.concurrent.justest.Thread4;

/**
 * @ClassName: JedisZsetDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月14日 下午4:10:59
 *
 */
public class JedisZsetDemo {
	private Jedis conn(){
		Jedis jedis = new Jedis("10.0.1.44");
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
				String mem = tempString.substring(0, tempString.indexOf(","));
				rtn.add(mem);
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
				String key = tempString.substring(0, tempString.indexOf(" "));
				rtn.add(key);
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
	
//	private List<String> getFirStrFileIcode(String path){
//		List<String> rtn = new ArrayList<String>();
//		try {
//			List<String> list = FileUtils.readLines(new File(path));
//			for(String str:list){
//				if(!str.isEmpty()){
//					String mem = str.substring(0, str.indexOf(","));
//					rtn.add(mem);
//				}
//				
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return rtn;
//	}
	
	private void threads(){
		try {
			ExecutorService exec = null;
			exec = Executors.newFixedThreadPool(5);
			exec.execute(new Thread1());
			exec.execute(new Thread2());
			exec.execute(new Thread3());
			exec.execute(new Thread4());
			exec.shutdown();
			while(!exec.isTerminated()){
				Thread.currentThread().sleep(10);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void process(String tokenPath,String icodePath){
		Jedis jedis = conn();
		List<String> keys = getFirStrFileToken(tokenPath);
		int count = 0;
		for(String key:keys){
			Random random = new Random(1000);
			System.out.println("key:"+key);
			List<String> mems = getFirStrFileIcode(icodePath);
			for(int i = 0;i<10;i++){
				count++;
//				System.out.println("count:"+count);
				jedis.zadd(key, random.nextInt(1000), mems.get(count));
				
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
		demo.process(tokenPath,icodePath);
	}
}
