package com.zkw.designpatterns.behavior.iteratorpattern.iterabaldemo;

import java.util.Iterator;

/**
 * 测试类
 *
 * @author James
 * @create 2017-08-01 上午 10:30
 **/

public class Client {
    private static void person2T(){
        System.out.println("testPerson2() method running");

        Person2 p = new Person2("300", 300);
        Person2 p1 = new Person2("30", 30);
        Person2 p2 = new Person2("40", 40);
        Person2 p3 = new Person2("50", 50);
        Person2 p4 = new Person2("60", 60);
        Person2 p5 = new Person2("70", 70);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);

        //Iterator
        Iterator<Person2> ii=p.iterator();
        while (ii.hasNext()) {
            System.out.println("Person2:  "+ii.next().toString());
        }
        System.out.println("testPerson2() method end\n");
    }
    /**
     * 使用"for each" 循环
     */
    private static void foreachT(){
        Person y1=new Person("1", 1);
        Person y2=new Person("2", 2);
        Person y3=new Person("3", 3);
        Person y4=new Person("4", 4);
        Person y5=new Person("5", 5);
        //数组
        Person y[]={y1,y2,y3,y4,y5};
        for (Person ys:y){
            System.out.println(ys.getName());
        }

        //Iterator
        System.out.println("Iterator<Person>...");
        Iterator<Person> i = new Person(10).iterator();
        while(i.hasNext()){
            System.out.println(i.next().toString());
        }
        //也可以这样打印
        System.out.println("other...");
        Person yy=new Person(20);
        for (Person ys : yy) {
            System.out.println(ys.toString());
        }
        System.out.println("testPerson() method end\n");

    }
    public static void main(String[] args) {
//        foreachT();
        person2T();
    }
}
