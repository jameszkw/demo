package com.zkw.rpc.rpcbsonhttp;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class Consumer {
	private void doPost() throws ClientProtocolException, IOException {
		String service = "com.zkw.rpc.rpcbsonhttp";
		String format = "json";
		String arg1 = "hello";
		String url = "http://localhost:8080/testhttprpc/provider?"+service+"&format="+format+"&arg1="+arg1;
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(url);
		HttpResponse response = httpClient.execute(get);
		HttpEntity entity = response.getEntity();
		byte[] bytes = EntityUtils.toByteArray(entity);
		String jsonresult = new String(bytes,"utf8");
		System.out.println(jsonresult);
		
	}

	public static void main(String[] args) {
		
	}
}
