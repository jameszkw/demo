package com.zkw.jetty_jersey.httpclient;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClientDemo {
	private void httpGet(String url) throws ClientProtocolException, IOException{
		HttpGet request = new HttpGet(url);
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = client.execute(request);
		
        BufferedInputStream in = new BufferedInputStream(response.getEntity().getContent());
        BufferedReader inBr = new BufferedReader(new InputStreamReader(in));
        String lineStr;
        while ((lineStr = inBr.readLine()) != null)
        	System.out.println(lineStr);
        inBr.close();
        in.close();
	}
	
	public static void main(String[] args) {
		HttpClientDemo http = new HttpClientDemo();
		try {
			http.httpGet("http://localhost:8080/entry-point/test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
