package com.javastu.generic;

import java.util.ArrayList;

public class GenericDetail {
    public static void main(String[] args) {
        //1. 给泛型指向数据类型时，要求是引用类型，不能是基本数据类型
        ArrayList<Integer> integers = new ArrayList<Integer>();//ok
        //ArrayList<int> integers = new ArrayList<int>();//错误

        //2.在给泛型指定具体类型后，可以传入该类型或其子类类型
        Pig<Animal> pig1 = new Pig<Animal>(new Animal());
        Pig<Animal> pig2 = new Pig<Animal>(new Cat1());

        //3. 泛型的使用形式
        // 简写，编译器会进行类型推断
        ArrayList<Integer> integers1 = new ArrayList<>();

        ArrayList arrayList = new ArrayList();//等价于  ArrayList<Object> arrayList= new ArrayList<>()
    }
}

class Animal{}
class Cat1 extends Animal{}

class Pig<E>{
    E name;

    public Pig(E name) {
        this.name = name;
    }

    public E method(){
        return name;
    }
}
