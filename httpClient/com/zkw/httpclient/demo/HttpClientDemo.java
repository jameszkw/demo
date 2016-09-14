package com.zkw.httpclient.demo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @ClassName: HttpClientDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月24日 下午12:14:55
 *
 */
public class HttpClientDemo {
	private static void post(String url, Map<String, String> params){
		try {
			HttpPost httpost = new HttpPost(url);
			List<NameValuePair> nvps = new ArrayList <NameValuePair>();
			Set<String> keySet = params.keySet();
			for(String key : keySet) {
				nvps.add(new BasicNameValuePair(key, params.get(key)));
			}
			System.out.println("set utf-8 form entity to httppost");
			httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
			httpost.setHeader("Content-Type", "application/json");
			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse httpResponse = httpClient.execute(httpost);
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			if (statusCode != 200) {
				System.out.println(statusCode);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

	private static void postxml(String url, String xml){
		try {
			HttpPost httpost = new HttpPost(url);

			System.out.println("set utf-8 form entity to httppost");
			httpost.setEntity(new StringEntity(xml));
			httpost.setHeader("Content-Type", "text/xml; charset=UTF-8");
			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse httpResponse = httpClient.execute(httpost);
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			if (statusCode != 200) {
				System.out.println(statusCode);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void scheduleTask_testjames() throws ParseException, JsonGenerationException, JsonMappingException, IOException{
		Map<String, String> params = new HashMap<String,String>();
		params.put("accountId", "1");
		params.put("testId", "1");
		params.put("name", "内部测试任务");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long start = sdf.parse("2015-08-07 15:00:00").getTime();
		params.put("startTime", start+"");
		long end = sdf.parse("2015-08-07 16:00:00").getTime();
		params.put("duration", "30");
		params.put("mvu", "300");
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(params);
		post("http://localhost:8040/acctmerchant/withdraw/applyWithDrawMer", params);
		
	}
	
	public static void main(String[] args) {
		try {
			scheduleTask_testjames();
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
