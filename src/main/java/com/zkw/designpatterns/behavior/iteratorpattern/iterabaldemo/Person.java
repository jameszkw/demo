package com.zkw.designpatterns.behavior.iteratorpattern.iterabaldemo;

import java.util.Iterator;

/**
 * 实现Iterable<E>接口的Person类
 *
 * @author James
 * @create 2017-07-31 下午 6:14
 **/

public class Person implements Iterable<Person> {
    private String name;
    private int age;
    /**
     * person数组，是目标操作对象
     */
    private Person[] person;

    /**
     * 为了方便简单点，故写一个这样的构造方法
     */
    public Person(int size) {
        person = new Person[size];
        for (int i = 0; i < size; i++) {
            person[i] = new Person("" + i, i);
        }
    }

    public void add(Person person) {
        //未实现这个方法
    }

    public Person() {
        //未实现这个方法
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 实现Iterable接口中要求实现的方法
     */
    public Iterator<Person> iterator() {
        return new MyIterator();//返回一个MyIterator实例对象
    }

    class MyIterator implements Iterator<Person> {
        /**
         * 相当于索引
         */
        private int index = 0;

        public boolean hasNext() {
            //只要在调用next()后，index自加，确保index不等于person的长度
            return index != person.length;
        }

        public Person next() {
            //使用索引来获取person数组中的某一项
            return person[index++];
        }
    }


    //getter
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
