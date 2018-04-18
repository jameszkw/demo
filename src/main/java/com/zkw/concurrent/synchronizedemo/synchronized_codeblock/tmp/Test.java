package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.tmp;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 3:16
 **/

public class Test {
    public static void main(String[] args) {
        MyList myList=new MyList();
        MyThreadA a=new MyThreadA(myList);
        a.setName("A");
        a.start();
        MyThreadB b=new MyThreadB(myList);
        b.setName("B");
        b.start();
    }
}
