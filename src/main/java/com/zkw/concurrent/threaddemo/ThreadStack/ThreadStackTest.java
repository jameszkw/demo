package com.zkw.concurrent.threaddemo.ThreadStack;

/**
 * 获取线程栈
 *
 * @author James
 * @create 2017-09-03 下午 5:01
 **/

public class ThreadStackTest {
    private static void printStack(StackTraceElement []stacks){
        for (StackTraceElement stack:stacks){
            System.out.println(stack);
        }
        System.out.println("\n");
    }

    private static StackTraceElement[] getStackByThread(){
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] getStackByException(){
        return new Exception().getStackTrace();
    }
    public static void main(String[] args) {

    }
}
