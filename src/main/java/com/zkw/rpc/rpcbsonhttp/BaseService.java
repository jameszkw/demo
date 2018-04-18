package com.zkw.rpc.rpcbsonhttp;

import java.util.Map;

public interface BaseService {
	public Object execute(Map<String,Object> args);
}
