package com.zkw.concurrent.synchronizedemo.synchronized_monitor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-27 下午 5:51
 **/

public class RunnableMain {
    public static void main(String[] args) {
        ExecutorService exec= Executors.newFixedThreadPool(2);
        exec.execute(new RunnableTest());
        exec.execute(new RunnableTest());
        exec.shutdown();
    }
    }
