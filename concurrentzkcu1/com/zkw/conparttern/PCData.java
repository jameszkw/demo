package com.zkw.conparttern;

/**
 * Created by Administrator on 2016/4/27 0027.
 */
public final class PCData {
    private final int intData;

    public PCData(int intData) {
        this.intData = intData;
    }
    public PCData(String intData) {
        this.intData = Integer.parseInt(intData);
    }

    public int getIntData() {
        return intData;
    }

    @Override
    public String toString() {
        return "data:"+intData;
    }
}
