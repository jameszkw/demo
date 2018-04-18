package com.zkw.collection.concurrentlinkedqueuedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class Test {
    public static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(4);
    public static  ConcurrentLinkedQueue linkedQueue = new ConcurrentLinkedQueue();

    private void liQueue(){

    }
    public static void main(String[] args) {
        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
        } catch (IllegalStateException e) {
            queue.remove();
            queue.add(5);
        }
        System.out.println("queue: "+queue);
        System.out.println("queeu peek: "+queue.peek());
        System.out.println(queue);
        List list = new ArrayList();
        queue.drainTo(list,3);
        System.out.println("list: "+list);
        System.out.println("queue: "+queue);
    }
}

