package com.zkw.designpatterns.behavior.iteratorpattern.iterabaldemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 实现Iterable<E>接口的Person2类
 *
 * @author James
 * @create 2017-08-01 上午 10:25
 **/

public class Person2 implements Iterable<Person2> {
    private String name;
    private int age;
    /**在Person2类中，person是一个数组链表*/
    private List<Person2> person=new ArrayList<Person2>();

    /**
     * 实现Iterable接口中要求实现的方法
     */
    public Iterator<Person2> iterator() {
        return new MyIterator();//返回一个MyIterator实例对象
    }

    class MyIterator implements Iterator<Person2>{
        /**相当于索引,不过不是数组索引*/
        private int index =0;

        public boolean hasNext() {
            return index!=person.size();
        }

        public Person2 next() {
            return person.get(index++);
        }
    }

    /**添加一个新Person2实例对象到person链表中*/
    public void add(Person2 person2){
        this.person.add(person2);
    }

    public Person2(){

    }

    public Person2(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "person [name=" + name + ", age=" + age + "]";
    }
}
