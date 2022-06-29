package com.javastu.set_;

import java.util.HashSet;
import java.util.Objects;

public class HashSetIncrement {
    public static void main(String[] args) {
        /*
        HashSet底层是HashMap，第一次添加时，table数组扩容到16，
        临界值(threshold)是16* 加载因子(LoadFactor)是0.75 = 12
        如果table 数组使用到了临界值12, 就会扩容到16 * 2 = 32,
        新的临界值就是32*0.75 = 24,依次类推
         */
        HashSet hashSet = new HashSet();
//        for (int i = 0; i < 100; i++) {
//            hashSet.add(i);
//        }

        /*
        在Java8中，如果一条链表的元素个数到达TREEIFY_THRESHOLD(默认是8 )，
        并且table的大小>= MIN_TREEIFY_CAPACITY(默认64)，就公进行树化(红黑树)，
        否则仍然采用数组扩容机制
         */

        for (int i = 0; i <= 12; i++) {
            hashSet.add(new A(i));
        }
        System.out.println("hashset = "+hashSet);

    }
}

class A{
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
