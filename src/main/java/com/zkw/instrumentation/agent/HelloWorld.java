package com.zkw.instrumentation.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * Created by Administrator on 2016/7/15 0015.
 */
public class HelloWorld implements ClassFileTransformer {

    public byte[] transform(ClassLoader loader, String className,
                            Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println("className: "+className);
        System.out.println("java.lang.instrument, hello world!");

        return null;
    }

    public static void premain(String args,Instrumentation inst){
        inst.addTransformer(new HelloWorld());
    }
}
