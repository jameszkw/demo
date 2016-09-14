package com.zkw.httpclient.demo;

/**
 * Created by Administrator on 2016/7/29 0029.
 */
public class JustTest {
    private void te(String msg){
        msg="te";
    }

    public static void main(String[] args) {
        String te="haha";
        JustTest justTest=new JustTest();
        justTest.te(te);
        System.out.println(te);
    }
}
