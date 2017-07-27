package com.zkw.designpatterns.behavior.interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 下午 3:20
 **/

public class Constant extends Expression{
    private boolean value;

    public Constant(boolean value){
        this.value = value;
    }

    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Constant){
            return this.value == ((Constant)obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }
}
