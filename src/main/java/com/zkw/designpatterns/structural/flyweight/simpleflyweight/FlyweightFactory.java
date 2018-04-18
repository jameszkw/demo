package com.zkw.designpatterns.structural.flyweight.simpleflyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-26 下午 3:46
 **/

public class FlyweightFactory {
    private Map<Character,FlyWeight> files = new HashMap<Character,FlyWeight>();

    public FlyWeight factory(Character state){
        //先从缓存中查找对象
        FlyWeight fly = files.get(state);
        if(fly == null){
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }

}
