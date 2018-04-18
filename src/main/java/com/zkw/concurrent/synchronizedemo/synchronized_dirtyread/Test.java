package com.zkw.concurrent.synchronizedemo.synchronized_dirtyread;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 10:41
 **/

public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA threadA=new ThreadA(publicVarRef);
            threadA.start();
            Thread.sleep(200);//打印结果受此值大小影响
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
