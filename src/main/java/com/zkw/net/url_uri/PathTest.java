package com.zkw.net.url_uri;

import java.net.URL;

/**
 * Created by Administrator on 2016/5/17 0017.
 */
public class PathTest {
    public static void getURL(){
        URL url = PathTest.class.getClassLoader().getResource("");
        System.out.println(url);
    }

    public static void getURL2(){
        URL url = PathTest.class.getClassLoader().getResource("com/zkw/net/confg.properties");
        System.out.println(url);
    }

    public static void getURI(){
        String uri = PathTest.class.getClassLoader().getResource("com/zkw/net/confg.properties").getPath();
        System.out.println(uri);
    }

    public static void main(String[] args) {
        getURL();
        getURL2();
        getURI();
    }
}
