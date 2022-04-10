package com.javastu.wrapper;

import org.w3c.dom.ls.LSOutput;

public class WrapperExercise02 {
    public  static void method() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);  //False，因为这里创建的是两个对象，连个对象用==比较的两个对象是不是同一个对象

        /**
         public static Integer valueOf(int i) {
         if (i >= IntegerCache.low && i <= IntegerCache.high)
         return IntegerCache.cache[i + (-IntegerCache.low)];
         return new Integer(i);
         }
         **/

        //通过Ctrl+B追溯 valueOf方法，这里转要看范围 -128~127 就是直接返回
        Integer m =1;   //  Ctrl+B追溯 valueOf方法,阅读源码
        Integer n =1;
        System.out.println(m==n);//返回T

        //传入的对象在 范围 -128~127之外
        Integer x=128;
        Integer y =128;
        System.out.println(x==y);//返回False
    }

    public static void main(String[] args) {
        method();
    }
}
