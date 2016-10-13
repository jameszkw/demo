package com.zkw.classtest;

/**
 * Created by Administrator on 2016/10/10 0010.
 */
public class Holder<T> {
    private T value;

    public T get(){
        return value;
    }

    public void set(T value){
        this.value = value;
    }
}
