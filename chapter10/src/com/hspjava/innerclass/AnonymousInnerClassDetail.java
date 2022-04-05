package com.hspjava.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {

    }
}

class Outer{
    private int n1=99;
    public void f1(){
        new Person(){
            @Override
            public void hi() {
                System.out.println();
            }
        };
    }

}

class Person{
    public void hi(){
        System.out.println("Person  hi()");
    }
}
