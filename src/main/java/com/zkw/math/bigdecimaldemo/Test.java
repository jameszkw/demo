package com.zkw.math.bigdecimaldemo;

import java.math.BigDecimal;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-01-31 下午 3:16
 **/

public class Test {
    private static void substract(){
        BigDecimal one = new BigDecimal(-100);
        BigDecimal two = new BigDecimal(200);
        System.out.println(two.subtract(one));

    }

    public static void main(String[] args) {
        substract();
    }
}
