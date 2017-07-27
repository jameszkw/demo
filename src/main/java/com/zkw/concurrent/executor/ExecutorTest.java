package com.zkw.concurrent.executor;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-6-9 下午7:36:24
 *
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest extends Thread {
private int index;
public ExecutorTest(int i){
    this.index=i;
}
public void run(){
    try{
     System.out.println("["+this.index+"] start....");
     Thread.sleep((int)(Math.random()*1000));
     System.out.println("["+this.index+"] end.");
    }
    catch(Exception e){
     e.printStackTrace();
    }
}
public static void main(String args[]){
    ExecutorService service=Executors.newFixedThreadPool(4);
    for(int i=0;i<10;i++){
     service.execute(new ExecutorTest(i));
     //service.submit(new MyExecutor(i));
    }
    System.out.println("submit finish");
    service.shutdown();
}
}
