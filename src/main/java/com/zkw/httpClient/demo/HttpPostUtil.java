package com.zkw.httpClient.demo;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;

/**
 * <p>
 * Description:
 * </p>
 * 
 * @Author liuhao
 * @Date [2015年5月25日]
 * @Version V1.0
 * @修改记录 <pre>
 * 版本号   修改人  修改时间     修改内容描述
 * ----------------------------------------
 * V1.0		刘浩 2015年5月25日	新建文件.
 * 
 * </pre>
 */
public class HttpPostUtil {

	private static final Log log = LogFactory.getLog(HttpPostUtil.class);

	/**
	 * post url请求
	 * 
	 * httpPost 方法描述: 逻辑描述:
	 * 
	 * @param url
	 * @param json
	 * @return
	 * @since Ver 1.00
	 */
	public static String HttpPost(String url,String data) {
		PostMethod method = new PostMethod(url);
		try {
			HttpClient client = new HttpClient();
			//请求超时
			int conTimeout = Integer.valueOf("50000");
			//读取超时
			int soTimeout = Integer.valueOf("50000");
			client.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeout);  
			client.getHttpConnectionManager().getParams().setSoTimeout(soTimeout);
			
			method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"utf-8");  
			// 表单域的值,既post传入的key=value
			NameValuePair valuePair1 = null;
			NameValuePair valuePair2 = null;

			valuePair1 = new NameValuePair(/*"userName", "admin"*/);// 派往一级
			valuePair2 = new NameValuePair(/*"password", "admin"*/);// 派往一级
			// method使用表单阈值
			method.setRequestBody(new NameValuePair[] { valuePair1,valuePair2 });
			// 提交表单
			client.executeMethod(method);
			// 字符流转字节流 循环输出，同get解释
			InputStream inputStream = method.getResponseBodyAsStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					inputStream, "UTF-8"));
			StringBuffer stringBuffer = new StringBuffer();
			String str = "";
			while ((str = br.readLine()) != null) {
				stringBuffer.append(str);
			}
			log.fatal("获取返回值："+stringBuffer.toString());
			return stringBuffer.toString();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 释放连接
			method.releaseConnection();
		} 
		return "";
	}
}
