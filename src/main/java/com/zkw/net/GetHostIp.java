/**
 * 
 */
package com.zkw.net;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * @ClassName: GetHostIp
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年8月12日 下午7:08:51
 *
 */
public class GetHostIp {
	public static void main(String[] args) throws Exception
	{
	    System.out.println("Your Host addr: " + InetAddress.getLocalHost().getHostAddress());  // often returns "127.0.0.1"
	    Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
	    for (; n.hasMoreElements();)
	    {
	        NetworkInterface e = n.nextElement();

	        Enumeration<InetAddress> a = e.getInetAddresses();
	        for (; a.hasMoreElements();)
	        {
	            InetAddress addr = a.nextElement();
	            System.out.println("  " + addr.getHostAddress());
	        }
	    }
	} 
}
