package com.javastu.generic.improve;


import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {

        //传统方法 ===> 使用泛型
        // 1. 当 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是Dog类型
        // 2. 如果编译器发现添加的类型，不满足需求，就会报错
        // 3. 遍历的时候直接可以去除Dog，而不是 Object
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财",3));
        arrayList.add(new Dog("大黄",2));
        arrayList.add(new Dog("小黄",5));

        //当添加一只猫，编译器就会提示
        //arrayList.add(new Cat("小喵",5));

        //遍历
        for (Dog dog : arrayList) {
            System.out.println(dog.name+" - "+dog.age);
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
