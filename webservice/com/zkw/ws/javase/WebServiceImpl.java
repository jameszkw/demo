package com.zkw.ws.javase;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @ClassName: WebServiceImpl
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月21日 上午10:42:54
 *
 */
@WebService(name="MyTestWS",serviceName="MyWebService",targetNamespace="http://localhost/client")
public class WebServiceImpl implements TestWebService{
	@Override
    public String echo() {
        return "webservice return msg";
    }
     
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/MyWebService", new WebServiceImpl());
    }
}
