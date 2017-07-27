package com.zkw.designpatterns.behavior.intermediate;

/**
 * 中介者类
 *
 * @author James
 * @create 2017-06-29 下午 2:56
 **/

public class Mediator extends AbstractMediator{

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }
    //处理A对B的影响
    @Override
    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number*100);
    }
    //处理B对A的影响
    @Override
    public void BaffectA() {
        int number = B.getNumber();
        A.setNumber(number/100);
    }
}
