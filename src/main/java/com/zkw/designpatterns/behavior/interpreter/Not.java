package com.zkw.designpatterns.behavior.interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 下午 5:10
 **/

public class Not extends Expression {
    private Expression exp;

    public Not(Expression exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Not) {
            return exp.equals(
                    ((Not) obj).exp);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(Not " + exp.toString() + ")";
    }
}
