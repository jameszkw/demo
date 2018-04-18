package com.zkw.designpatterns.structural.adapter.DefultAdapter;

/**
 * Created by Administrator on 2016/5/3 0003.
 */
public class ServiceAdapter implements AbstractService {
    public void serviceOperation1() {

    }

    public int serviceOperation2() {
        return 0;
    }

    public String serviceOperation3() {
        return null;
    }
}
