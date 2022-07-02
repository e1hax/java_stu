package com.javastu.generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        //传统方法
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财",3));
        arrayList.add(new Dog("大黄",2));
        arrayList.add(new Dog("小黄",5));


        //遍历
        for (Object obj :arrayList) {
            //向下转型为  Object -> Dog
            Dog dog = (Dog) obj;
            System.out.println(dog.name+"-"+dog.age);
        }
    }
}

class Dog{
    public String name ;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Cat{
    public String name ;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

}