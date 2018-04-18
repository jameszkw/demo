package com.zkw.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-27 下午6:46:24
 *
 */
public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println(InetAddress.getByName("124.202.149.5"));
		System.out.println(InetAddress.getByName("www.jiankongbao.com").getHostAddress());
	}
}
