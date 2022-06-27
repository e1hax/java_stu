package com.javastu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Books("三国演义","罗贯中",10));
        col.add(new Books("小李飞刀","古龙",5.1));
        col.add(new Books("红楼梦","曹雪芹",34.6));

        //1.使用增强for，不仅可以在集合中使用，也可以在数组中使用
        //2.底层仍然是Iterator迭代器
        //3.可以理解成简化版的迭代器
        //4.快捷键  输入I
        for (Object Books:col){
            System.out.println("Books="+Books);
        }
    }
}
