package com.zkw.rpc.rpcbsonhttp;

import java.util.Map;

public class SayHelloService implements BaseService {

	@Override
	public Object execute(Map<String, Object> args) {
		// TODO Auto-generated method stub
		String[] helloArg = (String[])args.get("arg1");
		if("hello".equals(helloArg[0])){
			return "hello";
		} else {
			return "bye bye!";
		}
	}
	
}
