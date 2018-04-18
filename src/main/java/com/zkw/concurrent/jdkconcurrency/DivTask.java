package com.zkw.concurrent.jdkconcurrency;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2016/4/25 0025.
 */
public class DivTask implements Runnable {

    int a,b;
    public DivTask(int a,int b) {
        this.a = a;
        this.b=b;
    }

    public void run() {
        double re=a/b;
        System.out.println(re);
    }

    public static void main(String[] args) {
        ThreadPoolExecutor exe = new ThreadPoolExecutor(0,Integer.MAX_VALUE,0L, TimeUnit.MILLISECONDS,new SynchronousQueue<Runnable>());

        for (int i=0;i<5;i++){
            Future re = exe.submit(new DivTask(100,i));
            try {
                re.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
