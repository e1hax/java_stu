package com.javastu.Exception_;

public class NullPointerException {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (java.lang.NullPointerException e  ) {
            e.printStackTrace();
        }
        System.out.println("程序继续运行。。。");

    }
}
