package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_8;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 3:36
 **/

public class MyService {
    private ReentrantLock lock=new ReentrantLock();
    private Condition condition= lock.newCondition();
    private boolean hasValue=false;
    public void set(){
        try {
            lock.lock();
            while (hasValue==true){
                System.out.println("有可能==连续");
                condition.await();
            }
            System.out.println("打印=");
            hasValue=true;
            condition.signalAll();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get(){
        try {
            lock.lock();
            while (hasValue==false){
                System.out.println("有可能--连续");
                condition.await();
            }
            System.out.println("打印-");
            hasValue=false;
            condition.signalAll();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
