package com.zkw.webservice.client;

import com.zkw.webservice.wsclient.MyWebService;

/**
 * @ClassName: Client
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月21日 上午11:45:16
 *
 */
public class Client {
	public static void main(String[] args) {
		MyWebService myWebService = new MyWebService();
		System.out.println(myWebService.getMyTestWSPort().echo());
	}
}
