package com.zkw.designpatterns.behavior.interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 下午 5:07
 **/

public class And extends Expression {
    private Expression left, right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) && right.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof And) {
            return left.equals(((And) obj).left) &&
                    right.equals(((And) obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " AND " + right.toString() + ")";
    }
}
