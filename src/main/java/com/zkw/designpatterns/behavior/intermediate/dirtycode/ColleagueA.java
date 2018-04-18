package com.zkw.designpatterns.behavior.intermediate.dirtycode;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 下午 2:35
 **/

public class ColleagueA extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number*100);
    }
}
