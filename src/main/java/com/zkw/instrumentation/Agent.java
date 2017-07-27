package com.zkw.instrumentation;

import java.lang.instrument.Instrumentation;

/**
 * Created by Administrator on 2016/7/11 0011.
 */
public class Agent {
    public static void premain(String args, Instrumentation inst) {
        System.out.println("Hi, I'm agent!");
        inst.addTransformer(new TestTransformer());
    }
}
