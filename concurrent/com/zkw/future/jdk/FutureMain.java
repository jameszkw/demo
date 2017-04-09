package com.zkw.future.jdk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Future模式的使用
 *
 * @author James
 * @create 2017-04-09 下午 8:14
 **/

public class FutureMain {
    public static void main(String[] args) {
        //构造FutureTask
        FutureTask<String> future=new FutureTask<String>(new RealData("a"));
        ExecutorService exe= Executors.newFixedThreadPool(1);
        //执行FutureTask,开启线程进行RealData的call执行
        exe.submit(future);
        System.out.println("请求完毕");
        try {
            //其他的业务逻辑马上执行，不必等待上面时间长的任务
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            //如果此时call()方法没有执行完成，依然会等待
            System.out.println("数据="+future.get());
            System.out.println("finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
