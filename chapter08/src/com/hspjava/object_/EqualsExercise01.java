package com.hspjava.object_;

import java.util.Objects;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 18, '男');
        Person person2 = new Person("Tom", 18, '男');

        System.out.println(person1.equals(person2));
    }
}


class Person{
    private String name;
    private int age;
    private char gender;

    //重写 Object 类的 equals 方法
    public boolean equals(Object obj) {
        //判断两个对象是否相等，如果相等直接返回 true
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person){ //是person才进行比较
            Person p =  (Person)obj;//向下转型
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }

        return false;
    }


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
