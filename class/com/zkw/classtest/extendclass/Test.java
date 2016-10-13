package com.zkw.classtest.extendclass;

/**
 * 父类调用getClass()
 */
public class Test {
    public static void main(String[] args) {
        AbstractConfig config = new BritainConfig();
        config.toString();
        config = new AbstractConfig();
        config.toString();
    }
}
