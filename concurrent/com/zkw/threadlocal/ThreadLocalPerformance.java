package com.zkw.threadlocal;

import java.util.Random;
import java.util.concurrent.*;

/**
 * 测试使用ThreadLocal和不使用的性能对比
 *
 * @author James
 * @create 2017-04-09 下午 9:45
 **/

public class ThreadLocalPerformance {
    public static final int GEN_COUNT=100000000;
    public static final int THEAD_COUNT=4;
    static ExecutorService exe=Executors.newFixedThreadPool(THEAD_COUNT);
    public static Random rnd=new Random(123);

    public static ThreadLocal<Random> tRnd=new ThreadLocal<Random>(){
        @Override
        protected Random initialValue() {
            return new Random(123);
        }
    };

    public static class RndTask implements Callable<Long>{
        private int mode=0;

        public RndTask(int mode) {
            this.mode = mode;
        }

        public Long call() throws Exception {
            long b=System.currentTimeMillis();
            for(long i=0;i<GEN_COUNT;i++){
                getRandom().nextInt();
            }
            long e=System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName()+"spend "+(e-b)+"ms");
            return e-b;
        }

        public Random getRandom(){
            if (mode==0){
                return rnd;
            } else if (mode==1){
                return tRnd.get();
            }else {
                return null;
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Long>[] f=new Future[THEAD_COUNT];
        for (int i=0;i<THEAD_COUNT;i++){
            f[i]=exe.submit(new RndTask(0));
        }
        long totaltime=0;
        for (int i=0;i<THEAD_COUNT;i++){
            System.out.println("before");
            totaltime+=f[i].get();
        }
        System.out.println("after");
        System.out.println("多线程访问同一个Random实例："+totaltime+"ms");

        //ThreadLocal的情况
        for (int i=0;i<THEAD_COUNT;i++){
            f[i]=exe.submit(new RndTask(1));
        }
        totaltime=0;
        for (int i=0;i<THEAD_COUNT;i++){
            totaltime+=f[i].get();
        }
        System.out.println("使用ThreadLocal包装Random实例："+totaltime+"ms");
        exe.shutdown();
    }
}
