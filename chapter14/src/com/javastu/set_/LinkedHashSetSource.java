package com.javastu.set_;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSource {
    public static void main(String[] args) {
        //分析LinkedHashSet底层机制
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("Tom",1001));
        set.add(123);
        set.add("Jack");
        System.out.println("set="+set);
        /*
        1. LinkedHashSet 加入顺序和取出元素/数据的顺序一致
        2. LinkedHashSet 底层维护的是一个 LinkedHashMap(是HashMap的子类)
        3. LinkedHashSet 底层结构(数组+双向链表)
        4. 添加第一次时，直接将数组 table 扩容到 16，存放的结点类型 LinkedHashMap$Entry
        5. 数组是 HashMap$Node[] 存放的元素/数据是 LinkedHashMap$Entry类型
         */
    }
}

class Customer{
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
