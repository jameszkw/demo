package com.zkw.future.book;

/**
 * 获取FutureData，并开启构造RealData的线程
 *
 * @author James
 * @create 2017-04-09 下午 7:42
 **/

public class Client {
    public Data request(final String queryStr) {
        final FutureData future = new FutureData();
        new Thread() {
            @Override
            public void run() {
                //RealData的构造很慢
                //所以在单独的线程中进行
                RealData realData = new RealData(queryStr);
                future.setRealData(realData);
            }
        }.start();
        //FutureData会被立即返回
        return future;
    }
}
