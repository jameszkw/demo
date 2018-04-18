package com.zkw.memory;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
public class WeakReferenceDemo {
    public static void main(String[] args) throws InterruptedException{
        Weak weak=new Weak();
        weak.src="aaa";
        ReferenceQueue<Weak> rq=new ReferenceQueue<Weak>();
        WeakReference<Weak> weakReference=new WeakReference<Weak>(weak,rq);
        weak = null; // make a = null ,not use this instance
        System.out.println(weakReference.get().src); //we also get it,not remove from heap
        System.gc(); //GC
        Thread.sleep(1000);
        Reference<? extends Weak> rs = rq.poll();
        System.out.println(rs.get()); // rs.get() is null,remove from heap

    }
}
