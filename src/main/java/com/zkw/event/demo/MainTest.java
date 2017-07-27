package com.zkw.event.demo;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class MainTest {
    public static void main(String[] args) {
        EventSourceObject object = new EventSourceObject();
        //注册监听器
        object.addCusListener(new CusEventListener(){
            public void fireCusEvent(CusEvent e) {
                super.fireCusEvent(e);
            }
        });
        //触发事件
        object.setName("eric");
    }
}
