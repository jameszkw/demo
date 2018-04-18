package com.zkw.reflect.invokemethodprivate;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-01-19 上午 9:34
 **/

public class TargetClass {
    private void send(Object1 object1){
        object1.setQue("1");
        System.out.println("send"+object1.toString());
    }

    public static void main(String[] args) {
        TargetClass targetClass=new TargetClass();
        targetClass.send(new Object1());
    }
}
