package com.zkw.LinkedBlockingDequeDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class Test {
    static LinkedBlockingDeque<Long> deque = new LinkedBlockingDeque<Long>();
    public static void main(String[] args) {
        deque.addFirst(1l);
        deque.addFirst(2l);
        deque.addFirst(3l);
        deque.addFirst(4l);
        deque.addFirst(5l);
        System.out.println("deque: "+deque);

       /* try {//从尾取
            deque.takeFirst();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

       /* try {//从头取
            deque.takeLast();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        List<Long> list = new ArrayList<Long>();
        deque.drainTo(list,3);
        System.out.println("list1: "+list);
        deque.remove();
        System.out.println("deque1: "+deque);
        deque.addFirst(2l);
        System.out.println("deque2: "+deque);
        for (int i = list.size()-1;i>=0;i--){
            System.out.println("long: "+list.get(i));
            deque.addFirst(list.get(i));
        }
        System.out.println("list: "+list);
        System.out.println("deque2: "+deque);
    }
}
