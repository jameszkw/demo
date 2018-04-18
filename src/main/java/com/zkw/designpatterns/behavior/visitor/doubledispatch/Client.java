package com.zkw.designpatterns.behavior.visitor.doubledispatch;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 上午 11:05
 **/

public class Client {
    public static void main(String[] args) {
        //组合1
        East east = new SubEast1();
        West west = new SubWest1();
        east.goEast(west);

        //组合2
        east = new SubEast1();
        west = new SubWest2();
        east.goEast(west);
    }
}
