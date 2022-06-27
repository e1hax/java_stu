package com.javastu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        // 1) void add(int index, Object ele);在index位置插入ele元素
        //    在 index=1 的位置插入一个对象
        list.add(1,"李小龙");
        System.out.println("list="+list);
//        2) boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("Jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println("list="+list);

//        3) Object get(int index):获取指定index位置的元素
        System.out.println(list.get(2));
//        4) int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
//        5) int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
         System.out.println(list.lastIndexOf("Jack"));
//        6) Object remove(int index):移除指定index位置的元素，井返回此元素
        list.remove(1);
        System.out.println("list="+list);
//        7) Object set(int index, Object ele):设置指定index位置的元素为eles,相当于是替换
        System.out.println("list="+list);
        list.set(1,"玛丽");
        System.out.println("list="+list);
//        8) List subList(int fromIndex, int tolndex):返回从fromlndex到tolndex位置的子集合
        List returnlist = list.subList(0,2);
        System.out.println("returnlist"+returnlist);
    }
}
