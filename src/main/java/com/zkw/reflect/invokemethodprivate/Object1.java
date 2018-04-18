package com.zkw.reflect.invokemethodprivate;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-01-19 上午 9:34
 **/

public class Object1 {
    private String que;
    private Integer one;

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    @Override
    public String toString() {
        return "Object1{" +
                "que='" + que + '\'' +
                ", one=" + one +
                '}';
    }
}
