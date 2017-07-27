package com.zkw.concurrent.conparttern;

/**
 * Created by Administrator on 2016/4/27 0027.
 */
public final class StableParttern { //确保无子类
    private final String no;    //私有属性，不会被其他对象获取
    private final String name;  //final保证属性不会被2次赋值
    private final double price;

    public StableParttern(String no, String name, double price) {   //在创建对象时，必须指定数据
        super();    //因为创建后，无法进行修改
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {

        return name;
    }

    public String getNo() {

        return no;
    }
}
