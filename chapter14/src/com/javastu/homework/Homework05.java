package com.javastu.homework;

import java.util.TreeSet;

public class Homework05 {
    public static void main(String[] args) {
        //add 方法，因为TreeSet() 构造器没有传入Comparator接口的匿名内部类
        // 所以在底层((Comparable<? super K>)k1).compareTo((K)k2)
        //            : comparator.compare((K)k1, (K)k2)
        //即 吧Person转换成 Comparable 类型
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());//ClassCastException异常
    }
    //解决方法  实现Comparable
}
class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}