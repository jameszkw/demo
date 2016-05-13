package com.zkw.experience.advanced.iterableDemo;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/5/13 0013.
 */
public class PersonMain {
    public static void main(String[] args) {
        System.out.println("String for... ...");
        String[] strs = {"1","2","3"};
        for (String str:strs){
            System.out.println(str);
        }
        System.out.println("Person for... ...");
        Person[] persons = {new Person("james",30),new Person("steven",28),new Person("harry",18)};
        for (Person person:persons){
            System.out.println(person);
        }
        System.out.println("Person iterable... ...");
        Iterator<Person> personIterator = new Person(10).iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next().toString());
        }
        System.out.println("Person for... ...");
        Person personFor = new Person(20);
        for (Person perso: personFor){
            System.out.println(perso.toString());
        }
//        System.out.println("Person() method running");
//        Person p1 = new Person("james",30);

    }
}
