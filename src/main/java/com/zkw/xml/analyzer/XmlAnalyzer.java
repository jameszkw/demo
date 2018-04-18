package com.zkw.xml.analyzer;

import javax.wsdl.*;
import javax.wsdl.extensions.*;
import javax.wsdl.factory.*;
import javax.wsdl.xml.*;
import javax.xml.namespace.QName;
import java.util.*;
import org.w3c.dom.*;

/**
 * @ClassName: XmlAnalyzer
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月20日 下午4:39:41
 *
 */
public class XmlAnalyzer {
	public static void main(String[] args) {
		try{
			   WSDLFactory factory=WSDLFactory.newInstance();
			   WSDLReader reader=factory.newWSDLReader();
			   reader.setFeature("javax.wsdl.verbose",true);
			   reader.setFeature("javax.wsdl.importDocuments",true);
			   Definition def=reader.readWSDL("http://localhost:8080/MyWebService?wsdl");
			         //解析服务名
			   System.out.println("----------");
			   System.out.println("\nService Name:");
			   String tns="http://localhost/client";
			        Service service =def.getService(new QName(tns,"MyWebService"));
			   System.out.println(service.getQName().getLocalPart());
			   //解析接口方法名
			   System.out.println("\nOperation Name:");
			   Port port =service.getPort("MyTestWSPort");
			   Binding binding=port.getBinding();
			   PortType portType=binding.getPortType();
			   List operations=portType.getOperations();
			   Iterator operIter=operations.iterator();
			   while(operIter.hasNext())
			   {
			    Operation operation=(Operation)operIter.next();
			    if(!operation.isUndefined())
			    {System.out.println(operation.getName()) ;}
			   }
			   //解析消息，输入输出
			   System.out.println("\nMessages:");
			   Map messages=def.getMessages();
			   Iterator msgIter=messages.values().iterator();
			   while(msgIter.hasNext())
			   {
			    Message msg=(Message)msgIter.next();
			    if(!msg.isUndefined())
			    {
			     System.out.println(msg.getQName().getLocalPart());
			     Iterator partIter=msg.getParts().values().iterator();
			     while(partIter.hasNext())
			     {
			      Part part=(Part) partIter.next();
			      System.out.print("parameter name:"+part.getName()+"\t");
			      System.out.println("parameter type:"+part.getTypeName().getLocalPart());
			     }
			    }
			   }
			   //解析服务地址
			   System.out.println("\nService location:");
			   List l=port.getExtensibilityElements();
			   ExtensibilityElement element=(ExtensibilityElement) l.get(0);
			   String s=element.toString();
			     System.out.println(s.substring(s.indexOf("location")));
			     System.out.println("---------");

			}catch(WSDLException e){e.printStackTrace();}
			}
	}
