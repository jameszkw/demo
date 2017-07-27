package com.zkw.concurrent.jdkconcurrency;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2016/4/25 0025.
 * 因为线程池打印的异常不包括调用的地方，此方法可以实现。
 */
public class TraceThreadPoolExecutor extends ThreadPoolExecutor {
    public TraceThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    @Override
    public void execute(Runnable command) {
        super.execute(wrap(command,clientTrace(),Thread.currentThread().getName()));
    }

    @Override
    public Future<?> submit(Runnable task) {
        return super.submit(wrap(task,clientTrace(),Thread.currentThread().getName()));
    }

    private Exception clientTrace(){
        return new Exception("Client stack trace");
    }

    private Runnable wrap(final Runnable task,final Exception clientStack,String clientThreadName){
        return new Runnable() {
            public void run() {
                try {
                    task.run();
                } catch (Exception e) {
                    clientStack.printStackTrace();
                    try {
                        throw e;
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }
        };
    }

    public static void main(String[] args) {
        ThreadPoolExecutor exe = new TraceThreadPoolExecutor(0,Integer.MAX_VALUE,0L,TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
        //错误堆栈中可以看到是在哪里提交的任务
        for (int i=0;i<5;i++){
            exe.execute(new DivTask(100,i));
        }
    }
}
