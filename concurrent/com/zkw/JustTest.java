package com.zkw;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class JustTest {
    private int count=0;
    private Set set = new HashSet();
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
