package com.zkw.sigar.demo;

import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.SigarProxy;
import org.hyperic.sigar.SigarProxyCache;

public class NetworkData {

	protected static SigarProxy sigar = SigarProxyCache.newInstance();

	private void getIPs(){
		try {
			String[] nets = sigar.getNetInterfaceList();
			for (int i = 0; i < nets.length; i++) {
				String name = nets[i];
				NetInterfaceConfig ifconfig = sigar.getNetInterfaceConfig(name);
				if(!ifconfig.getAddress().equals("0.0.0.0")){
					System.out.println(ifconfig.getAddress());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		NetworkData data = new NetworkData();
		data.getIPs();
	}
}