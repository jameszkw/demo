package com.zkw.concurrent.future.book;

/**
 * 最终需要使用的数据模型
 *
 * @author James
 * @create 2017-04-09 下午 4:41
 **/

public class RealData implements Data {
    protected final String result;

    public RealData(String para) {
        //RealData的构造很慢，需要用户等待很久（模拟）
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<10;i++){
            sb.append(para);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.result = sb.toString();
    }

    public String getResult() {
        return result;
    }
}
