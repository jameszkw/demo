package com.zkw.designpatterns.behavior.visitor.doubledispatch;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 上午 10:59
 **/

public class SubEast2 extends East {
    @Override
    public void goEast(West west) {
        west.goWest2(this);
    }
    public String myName2(){
        return "SubEast2";
    }
}
