package com.zkw.concurrent.future.book;

/**
 * 封装获取RealData的等待过程，真实数据RealData的代理
 *
 * @author James
 * @create 2017-04-09 下午 4:40
 **/

public class FutureData implements Data {
    protected RealData realData;//FutureData是Readable的包装
    protected boolean isReady=false;

    public synchronized void setRealData(RealData realData) {
        if (isReady){
            return;
        }
        this.realData = realData;
        isReady=true;
        //RealData已经被注入，通知getResult()
        notifyAll();
    }

    public synchronized String getResult() {
        while (!isReady){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.result;
    }
}
