package com.zkw.concurrent;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class JustTest {
    private int count=0;
    private Set set = new HashSet();
    Lock lock;
    public int inc(){
        synchronized (this){
            set.add("d");
            return ++count;
        }
    }
    public static void main(String[] args) {
//        Lock lock=new ReentrantReadWriteLock.ReadLock();
    }
}
