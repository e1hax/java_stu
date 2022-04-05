package com.javastu.Exception_;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b =10;
            System.out.println(b/a);
        } catch (java.lang.ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("程序继续执行");
    }
}
