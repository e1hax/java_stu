package com.javastu.map_;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋哲","马蓉");
        map.put("刘令博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        // 第一组：先取出所有key  ，通过key取出对应的 value
        Set keySet = map.keySet();
        //(1)增强for
        System.out.println("-----第一种方式-----");
        for (Object key :keySet) {
            System.out.println(key+"-"+map.get(key));
        }

        //(2)迭代器
        System.out.println("-----第二种方式-----");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+"-"+map.get(key));
        }

        //第二组：把所有value取出
        Collection values = map.values();
        //(1)增强for
        System.out.println("-----增强for取出所有value-----");
        for (Object value :values) {
            System.out.println(value);
        }
        //(2)迭代器
        System.out.println("-----迭代器取出所有value-----");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }

        //第三组:通过EntrySet 来获取 k-v
        Set entrySet = map.entrySet();
        //(1) 增强for
        System.out.println("-----增强for  EntrySet 取出所有key - value-----");
        for (Object entry :entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        //(2) 迭代器
        System.out.println("-----迭代器  EntrySet 取出所有key - value-----");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry n = (Map.Entry) next;
            System.out.println(n.getKey()+"-"+n.getValue());

        }

    }
}
