package com.zkw.xml.springxml;

import org.springframework.beans.factory.config.BeanDefinition;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/7/13 0013.
 */
public class XmlBeanDefinitionReader {
    private void loadBeanDefinitions(String location) throws Exception{
        ResourceLoader resourceLoader =new ResourceLoader();
        InputStream inputStream = resourceLoader.getResource(location).getInputStream();
        doLoadBeanDefinitions(inputStream);
    }

    protected void doLoadBeanDefinitions(InputStream inputStream) throws Exception {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = factory.newDocumentBuilder();
        Document document=docBuilder.parse(inputStream);
        // 解析bean
        registerBeanDefinitions(document);
        inputStream.close();
    }

    public void registerBeanDefinitions(Document doc) {
        Element root =doc.getDocumentElement();
        System.out.println(root.getNodeName());
        parseBeanDefinitions(root);
    }
    protected void parseBeanDefinitions(Element root) {
        NodeList nl=root.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            Node node = nl.item(i);
            if (node instanceof Element) {
                Element ele = (Element) node;
                processBeanDefinition(ele);
            }
        }
    }
    protected void processBeanDefinition(Element ele) {
        String name = ele.getAttribute("name");
        String className = ele.getAttribute("class");
        com.zkw.xml.springxml.BeanDefinition beanDefinition=new com.zkw.xml.springxml.BeanDefinition();
        processProperty(ele,beanDefinition);
        beanDefinition.setBeanClassName(className);
//        getRegistry().put(name, beanDefinition);
    }
    private void processProperty(Element ele,com.zkw.xml.springxml.BeanDefinition beanDefinition) {

    }
    public static void main(String[] args) {
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader();
        try {
            reader.loadBeanDefinitions("tinyioc.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
