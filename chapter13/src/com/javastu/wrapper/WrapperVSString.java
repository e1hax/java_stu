package com.javastu.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer) -> String
        Integer i =100;//自动装箱
        //方式1
        String str1 = i+"";
        //方式2
        String st2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String -> 包装类(Integer)
        String str4 = "1234";
        Integer i2 = Integer.parseInt(str4);//使用到自动装箱
        Integer i3 = new Integer(str4);   //通过Integer类的构造器

        System.out.println("ok");


    }
}
