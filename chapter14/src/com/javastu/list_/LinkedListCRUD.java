package com.javastu.list_;

import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

        //修改某个结点对象
        linkedList.set(0,999);
        System.out.println(linkedList);

        //得到某结点
        Object o = linkedList.get(0);
        System.out.println(o);


        //源码阅读
        // 1. LinkedList linkedList = new LinkedList()；
        //    public LinkedList() {}
        // 2.这时 linkedlist 的属性 frist = null    last = null
        // 3. 执行  public boolean add(E e) {
        //        linkLast(e);
        //        return true;
        //    }
        // 4. 将新的结点，加入到双向链表的最后
        //       void linkLast(E e) {
        //        final Node<E> l = last;
        //        final Node<E> newNode = new Node<>(l, e, null);
        //        last = newNode;
        //        if (l == null)
        //            first = newNode;
        //        else
        //            l.next = newNode;
        //        size++;
        //        modCount++;
        //    }
    }
}
