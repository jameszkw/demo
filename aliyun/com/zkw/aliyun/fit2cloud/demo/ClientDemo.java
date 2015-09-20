package com.zkw.aliyun.fit2cloud.demo;

import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.ecs.ECSClient;
import com.fit2cloud.aliyun.ecs.model.response.ListRegionsResponse;

/**
 * @ClassName: ClientDemo
 * @Description: 查看源码用
 * @author James.zhang
 * @date 2015年9月15日 下午6:03:24
 *
 */
public class ClientDemo {
	private void test(){
		try {
			String ACCESS_KEY_ID = "你的阿里云API Access key";
	        String ACCESS_KEY_SECRET = "你的阿里云API Secret key";
	        ECSClient client = new ECSClient(new AliyunCredentials(ACCESS_KEY_ID, ACCESS_KEY_SECRET));
	        ListRegionsResponse response = client.listRegions();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		   
	}
}
