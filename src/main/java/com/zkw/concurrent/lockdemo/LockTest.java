package com.zkw.concurrent.lockdemo;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Administrator on 2016/6/13 0013.
 * 读写锁 of api
 */
public class LockTest {
    private void test(){
        ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
        readWriteLock.readLock().lock();
        readWriteLock.readLock().unlock();

        readWriteLock.writeLock().lock();
        readWriteLock.writeLock().unlock();

    }
    public static void main(String[] args) {

    }
}
