package com.zkw.concurrent.volatiledemo;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class DemoTest {
    public static void main(String[] args) {
        BooleanDemo demo1 = new BooleanDemo();
        demo1.start();
        BooleanDemo demo2 = new BooleanDemo();
        demo2.setFlag(2);

    }
}
