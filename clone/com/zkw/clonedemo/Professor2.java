package com.zkw.clonedemo;

import java.io.Serializable;

/**
 *
 */
public class Professor2 implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Professor2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
