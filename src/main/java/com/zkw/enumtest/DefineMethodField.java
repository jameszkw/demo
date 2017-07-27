package com.zkw.enumtest;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
public enum  DefineMethodField {
    MON(1),TUE(2),WED(3),THU(4),FRI(5),SAT(6){
        @Override
        public boolean isRest() {
            return false;
        }
    },SUN(0){
        @Override
        public boolean isRest() {
            return true;
        }
    };


    private int value;
    private DefineMethodField(int value){
        this.value = value;
    }

    public int value(){
        return value;
    }
    public boolean isRest(){
        return false;
    }


    public static void main(String[] args) {
        System.out.println("DefineMethodField.FRI的value= "+DefineMethodField.FRI.value());
    }
}
