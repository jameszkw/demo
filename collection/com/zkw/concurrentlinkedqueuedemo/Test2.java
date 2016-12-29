package com.zkw.concurrentlinkedqueuedemo;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            Test.queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
