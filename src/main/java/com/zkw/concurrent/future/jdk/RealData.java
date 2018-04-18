package com.zkw.concurrent.future.jdk;

import java.util.concurrent.Callable;

/**
 * call()构造真实的数据
 *
 * @author James
 * @create 2017-04-09 下午 8:11
 **/

public class RealData implements Callable<String> {
    private String para;

    public RealData(String para) {
        this.para = para;
    }

    public String call() throws Exception {
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<100;i++){
            sb.append(para);
            Thread.sleep(100);
        }
        return sb.toString();
    }
}
