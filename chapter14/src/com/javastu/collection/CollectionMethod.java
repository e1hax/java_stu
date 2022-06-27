package com.javastu.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        // 1) add:添加单个元素
        list.add("tom");
        list.add(10);
        list.add("jack");
        System.out.println("list="+list);
        // 2) remove:删除指定元素
        list.remove("tom"); //删除tom元素
        list.remove(1); //删除第二个元素
        System.out.println("list="+list);
        // 3) contains:查找元素是否存在
        System.out.println(list.contains("jack"));
        // 4) size:获取元素个数
        System.out.println(list.size());
        // 5) isEmpty:判断是否为空
        System.out.println(list.isEmpty());
        // 6) clear:清空
        // list.clear();
        // 7) addAll:添加多个元素
        List list2 = new ArrayList();
        list2.add("三国演义");
        list2.add("水浒传");
        list.addAll(list2);
        System.out.println("list = "+list);
        // 8) containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(list2));
        // 9) removeAll:删除多个元素
        list.removeAll(list2);
        System.out.println("list = "+list);
    }
}
