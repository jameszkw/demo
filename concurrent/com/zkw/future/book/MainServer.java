package com.zkw.future.book;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-09 下午 7:47
 **/

public class MainServer {
    public static void main(String[] args) {
        Client client=new Client();
        //立即返回，得到FutureData而不是真正的数据RealData
        Data data=client.request("name");
        System.out.printf("请求完毕");
        try {
            //处理其他的业务逻辑
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //使用真实数据
        System.out.println("数据="+data.getResult());
    }
}
