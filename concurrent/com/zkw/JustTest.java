package com.zkw;

/**
 * Created by Administrator on 2016/6/12 0012.
 */
public class JustTest {
    private int count=0;
    public int inc(){
        synchronized (this){
            return ++count;
        }
    }
    public static void main(String[] args) {
//        Lock lock=new ReentrantReadWriteLock.ReadLock();
    }
}
