package com.zkw.designpatterns.behavior.visitor.doubledispatch;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 上午 10:57
 **/

public class SubEast1 extends East {
    @Override
    public void goEast(West west) {
        west.goWest1(this);
    }

    public String myName1(){
        return "SubEast1";
    }
}
