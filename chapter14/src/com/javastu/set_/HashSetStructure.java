package com.javastu.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        // 模拟一个HashSet的底层 (HashMap 的底层结构)

        //1. 创建一个数组，他的类型是 Node[]
        //2. 有些人直接吧Node[] 数组称为 表
        Node[] table = new Node[16];
        System.out.println("table="+table);

        //3. 创建节点
        Node jhon = new Node("jhon", null);
        // 将 jhon 放到 table表 索引为2的位置
        table[2] =jhon;
        Node jack = new Node("Jack", null);
        // 将jack挂载到 jhon后面
        jhon.next=jack;
        Node rose = new Node("Rose", null);
        // 将rose挂载到 jack后面
        jack.next=rose;

        Node lucy = new Node("Lucy", null);
        // 将 lucy 放到 table表 索引为3的位置
        table[3]=lucy;
        System.out.println("table = "+table);

    }
}

class Node{
    // 节点 ，存储数据，可以指向下一个节点，从而形成链表
    Object item;//存放数据
    Node next;//指向下一个接地那

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}