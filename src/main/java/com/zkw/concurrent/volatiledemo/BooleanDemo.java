package com.zkw.concurrent.volatiledemo;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class BooleanDemo extends Thread {
    private static int flag = 1;
    @Override
    public void run() {
        while (true){
            System.out.println(flag);

        }
    }

    public void setFlag(int flag){
        this.flag = flag;
    }

    public static void main(String[] args) {
        BooleanDemo demo1 = new BooleanDemo();
        BooleanDemo demo2 = new BooleanDemo();
        demo1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demo2.setFlag(2);
        demo2.start();
    }
}
