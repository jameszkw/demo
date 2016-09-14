package com.zkw.xml.springxml;

import java.net.URL;

/**
 * Created by Administrator on 2016/7/13 0013.
 */
public class ResourceLoader {

    public Resource getResource(String location){
        URL url = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(url);
    }

    public static void main(String[] args) {
        ResourceLoader resourceLoader=new ResourceLoader();
        resourceLoader.getResource("tinyioc.xml");
    }
}
