package com.zkw.designpatterns.behavior.intermediate;

/**
 * 抽象中介者类
 *
 * @author James
 * @create 2017-06-29 下午 2:56
 **/

public abstract  class AbstractMediator {
    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();
}
