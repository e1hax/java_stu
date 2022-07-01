package com.javastu.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        //1. 当我们使用无参构造器，创建TreeSet时，任然是无序的
        //2. 使用TreeSet 提供的一个构造器，可以传入一个比较器，匿名内部类
        //3.
        TreeSet treeSet = new TreeSet(new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("jeam");
        treeSet.add("jason");
        treeSet.add("yiyi");
        System.out.println("treeset="+treeSet);

        /*
        1.构造器把传入的比较器对象，赋给了 TreeSet 的底层的 TreeMap 的属性this.comparator
                public TreeMap(Comparator<? super K> comparator) {
                    this.comparator = comparator;
                }
        2. 在调用 treeSet.add("tom"); 在底层会执行到
                if (cpr != null) {
                    do {
                        parent = t;
                        cmp = cpr.compare(key, t.key);
                        if (cmp < 0)
                            t = t.left;
                        else if (cmp > 0)
                            t = t.right;
                        else
                            return t.setValue(value);
                    } while (t != null);
                }

         */
    }
}
