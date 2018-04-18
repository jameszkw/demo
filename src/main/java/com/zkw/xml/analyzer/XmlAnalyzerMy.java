package com.zkw.xml.analyzer;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.wsdl.Definition;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;

/**
 * @ClassName: XmlAnalyzerMy
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月20日 下午7:40:15
 *
 */
public class XmlAnalyzerMy {
	public static void main(String[] args) {
		try {
			WSDLFactory factory=WSDLFactory.newInstance();
			WSDLReader reader=factory.newWSDLReader();
			reader.setFeature("javax.wsdl.verbose",true);
			reader.setFeature("javax.wsdl.importDocuments",true);
//			Definition def=reader.readWSDL("https://api.nciic.com.cn/nciic_ws/services/NciicServices?wsdl");
			Definition def=reader.readWSDL("https://api.nciic.com.cn/nciic_ws/services/NciicServices?wsdl");
			//解析服务名
			System.out.println("----------");
//			System.out.println("\nService Name:");
//			System.out.println(def.getServices());
			System.out.println("\nPortTypes Name:");
			System.out.println(def.getPortTypes());
			Map map = def.getPortTypes();
			Set keySets = map.keySet();
			Iterator it = keySets.iterator();
			System.out.println("----------");
			while(it.hasNext()){
				System.out.println(it.next());
			}
//			String tns="https://api.nciic.com.cn/nciic_ws/services/nciicDiscern";
//	        Service service =def.getService(new QName("nciicDiscern"));
//	        System.out.println(service.getPorts());
	        
	        
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		   
	}
}
