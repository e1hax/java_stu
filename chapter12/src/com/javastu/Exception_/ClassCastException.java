package com.javastu.Exception_;

public class ClassCastException {
    public static void main(String[] args) {
        A b = new B();  //向上转型
        B b2 = (B)b;//向下转型，这里可以，不会异常
        try {
            C c2 = (C)b;//B和C没有任何关系，会出现异常
        } catch (java.lang.ClassCastException e ) {
            e.printStackTrace();
        }
    }
}


class A {
}

class B extends A {
}

class C extends A {
}