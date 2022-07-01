package com.javastu.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return  ((String) o1).compareTo((String) o2);
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("jason","杰森");
        treeMap.put("smith","史密斯");
        System.out.println("treeMap="+treeMap);

        /*
        1. 构造器，把传入的实现了 Comparator 接口的匿名内部类(对象) ，传给 TreeMap的comparator
                public TreeMap(Comparator<? super K> comparator) {
                    this.comparator = comparator;
                }
        2. 调用put方法
        2.1 第一次添加，把 k-v封装到Entry对象，放入 root
                Entry<K,V> t = root;
                if (t == null) {
                    compare(key, key); // type (and possibly null) check

                    root = new Entry<>(key, value, null);
                    size = 1;
                    modCount++;
                    return null;
                }
        2.2 以后添加
                Comparator<? super K> cpr = comparator;
                if (cpr != null) {
                    do {
                        parent = t;
                        cmp = cpr.compare(key, t.key);//动态绑定匿名内部类的compare方法
                        if (cmp < 0)
                            t = t.left;
                        else if (cmp > 0)
                            t = t.right;
                        else //如果遍历过程中，发现准备添加的key 和 当前已有的 key相等，就不添加
                            return t.setValue(value);
                    } while (t != null);
                }
         */
    }
}
