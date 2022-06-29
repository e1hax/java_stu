package com.javastu.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        // 1.以 Set 接口的实现类 HashSet 来讲解Set 接口的方法
        // 2.Set 接口的实现类的对象(Set接口对象)，不能存放重复的元素，可以添加一个null
        // 3.set 接口对象存放数据是无序的（即添加的顺序和取出的顺序不一致）
        // 4.注意：取出的顺序的顺序虽然不是添加的顺序，但是他是固定的
        // 5.set接口对象不能通过索引来获取
        Set set = new HashSet();
        set.add("jack");
        set.add("tom");
        set.add("mary");
        set.add("jason");
        set.add("tom");//重复
        set.add(null);
        set.add(null);
        for (int i = 0; i < 10; i++) {
            System.out.println("set = "+set);
        }

        //迭代器遍历
        System.out.println("=====迭代器遍历======");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj = "+obj);
        }

        //增强for循环
        System.out.println("=====增强for遍历======");
        for (Object o :set) {
            System.out.println("o = "+o);
        }

    }
}
