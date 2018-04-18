package com.zkw.designpatterns.behavior.visitor.staticdispatch;

/**
 * 静态分派
 *
 * @author James
 * @create 2017-06-29 上午 10:28
 **/

public class Mozi {
    public void ride(Horse h){
        System.out.println("骑马");
        h.eat();
    }

    public void ride(WhiteHorse wh){
        System.out.println("骑白马");
    }

    public void ride(BlackHorse bh){
        System.out.println("骑黑马");
    }

    public static void main(String[] args) {
        Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        BlackHorse bh2 = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(wh);
        mozi.ride(bh);
        mozi.ride(bh2);
    }
}
