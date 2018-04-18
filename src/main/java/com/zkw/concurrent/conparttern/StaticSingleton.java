package com.zkw.concurrent.conparttern;

/**
 * Created by Administrator on 2016/4/27 0027.
 * 最好的单例模式
 */
public class StaticSingleton {
    private StaticSingleton(){
        System.out.println("StaticSingletion is created");
    }

    private static class SingletonHoler{
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingletonHoler.instance;
    }
}
