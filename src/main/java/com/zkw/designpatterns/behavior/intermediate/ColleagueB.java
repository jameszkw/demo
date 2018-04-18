package com.zkw.designpatterns.behavior.intermediate;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 下午 2:58
 **/

public class ColleagueB extends AbstractColleague{
    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
