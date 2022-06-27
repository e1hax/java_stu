package com.javastu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("大黄",3));
        list.add(new Dog("小朵",5));
        list.add(new Dog("小欧",2));

        //Iterator迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("迭代器："+obj);
        }
        System.out.println("======================");
        //增强for循环
        for (Object Dog : list) {
            System.out.println("增强for："+Dog);
        }
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "name="+name+", age="+age;
}}
