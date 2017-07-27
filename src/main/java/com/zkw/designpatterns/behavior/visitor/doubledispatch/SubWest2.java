package com.zkw.designpatterns.behavior.visitor.doubledispatch;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 上午 11:07
 **/

public class SubWest2 extends West {
    @Override
    public void goWest1(SubEast1 east) {
        System.out.println("SubWest2 + " + east.myName1());
    }

    @Override
    public void goWest2(SubEast2 east) {
        System.out.println("SubWest2 + " + east.myName2());
    }
}
