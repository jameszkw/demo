package com.zkw.designpatterns.structural.flyweight.simpleflyweight;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-26 下午 3:43
 **/

public class ConcreteFlyweight implements FlyWeight {
    private Character intrinsicState = null;
    /**
     * 构造函数，内蕴状态作为参数传入
     * @param state
     */
    public ConcreteFlyweight(Character state){
        this.intrinsicState = state;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
