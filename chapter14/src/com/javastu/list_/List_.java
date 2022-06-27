package com.javastu.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        // 1.List集合类中元素有序（即添加顺序和取出顺序一致）、且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("tony");
        list.add("dh");
        list.add("tom");
        System.out.println("list="+list);

        // 2.List集合中的每个元素都有其对应的顺序索引，即支持索引，索引从0开始
        System.out.println(list.get(3));

        // 3.
    }
}

