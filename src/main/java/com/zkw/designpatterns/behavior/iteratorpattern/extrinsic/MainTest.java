package com.zkw.designpatterns.behavior.iteratorpattern.extrinsic;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-27 下午 6:35
 **/

public class MainTest {
    public void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }

    public static void main(String[] args) {
        MainTest test = new MainTest();
        test.operation();
    }
}
