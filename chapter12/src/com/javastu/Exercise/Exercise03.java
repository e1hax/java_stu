package com.javastu.Exercise;

public class Exercise03 {
    public static void main(String[] args) {
        try {
            func();
            //发生异常后，下面的语句不再执行
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");

    }

    public static void func(){
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }
}

