package com.zkw.event.demo1;

/**
 * Created by Administrator on 2016/9/29 0029.
 */
public class DemoListener1 implements DemoListener{
    public void handleEvent(DemoEvent dm) {
        System.out.println("Inside listener1...");
        dm.say();//回调
    }
}
