package com.zkw.designpatterns.behavior.visitor.doubledispatch;

/**
 * 双重分派
 *
 * @author James
 * @create 2017-06-29 上午 10:55
 **/

public abstract class West {
    public abstract void goWest1(SubEast1 east);

    public abstract void goWest2(SubEast2 east);
}
