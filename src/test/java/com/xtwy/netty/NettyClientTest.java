package com.xtwy.netty;

import org.junit.Test;

/**
 * Created by Administrator on 2016/4/17 0017.
 */
public class NettyClientTest {

    @Test
    public void test01(){
        try {
            for (int i=0;i<1;i++){
                long start = System.currentTimeMillis();
                Object obj = DiscardClient.startClient(i);
                if (obj==null){
                    throw new RuntimeException("返回数据为空");
                }
                System.out.println("client's data: "+obj);
                long end = System.currentTimeMillis();
                System.out.println("用时："+(end-start));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
