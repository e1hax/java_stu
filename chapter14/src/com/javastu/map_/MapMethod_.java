package com.javastu.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋哲","马蓉");
        map.put("刘令博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        // remove:根据键删除映射关系
        map.remove(null);
        // get：根据键获取值
        map.get("王宝强");
        //size：获取元素个数
        System.out.println(map.size());
        //isEmpty:判断个数是否为0
        System.out.println(map.isEmpty());
        //clear:清除 k-v
        map.clear();
        //containsKey:查找键是否存在
        System.out.println(map.containsKey("jack"));
        System.out.println("map="+map);


    }
}

class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}