package com.hspjava.static_;

public class visitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);

        A a = new A();
        System.out.println("a.name = "+a.name);
    }
}

class A{
    public static String name = "new world";
}
