package com.javastu.string_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp";// a指向常量池的 "hsp"
        String b = new String("hsp");   //b指向堆中对象
        System.out.println(a.equals(b));   //逐个比较字符串里面的字符
        System.out.println(a==b);
        System.out.println(a==b.intern());
        System.out.println(b=b.intern());
        /**
         * 知识点：
         * 当调用intern()方法时，如果池已近包含一个等于此String对象的字符串（用equals(Object)方法确定），
         * 则返回池中的字符串。否则，将此String对象添加到池中，并返回此String对象的引用
         * 也就是说：b.intern() 方法最终返回的是常量池的地址(对象)
         */

        String c = "hello";
        String d = "abc";
        String e = a+b;

        /**
         * 底层是 StringBuilder sb = new StringBuilder(); sb.append(c);
         *      sb.append(d); sb是在堆中，并且append是在原来字符串的基础上追加的
         * 重要规则，String c1 = "ab"+"cd"; 常量相加，看的是池
         *         String c1 = a+b;  变量相加，是在堆中
         */


    }
}
