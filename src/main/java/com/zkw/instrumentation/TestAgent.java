package com.zkw.instrumentation;

/**
 * Created by Administrator on 2016/7/11 0011.
 */
public class TestAgent {
    public static void main(String[] args) {
        TestAgent ta = new TestAgent();
        ta.test();
    }

    public void test() {
        System.out.println("I'm TestAgent");
    }
}
