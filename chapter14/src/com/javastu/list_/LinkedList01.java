package com.javastu.list_;

public class LinkedList01 {

    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mary = new Node("mary");

        //链接三个节点  形成双向链表
        jack.next=tom;
        tom.next=mary;

        mary.pre=tom;
        tom.pre=jack;

        Node  frist= jack;//头结点指向 jack
        Node last = mary;// 尾节点指向 mary


        // 添加 simith 到tom后面
        Node smith = new Node("smith");
        tom.next =smith;
        smith.next = mary;

        smith.pre = tom;
        mary.pre=smith;



        //从头到尾的遍历
        while (true){
            if(frist==null){
                break;
            }
            //输出 first 信息
            System.out.println(frist);
            frist = frist.next;
        }




        //从尾到头的遍历
        while (true){
            if(last==null){
                break;
            }
            //输出 first 信息
            System.out.println(last);
            last = last.pre;
        }
    }
}

//定义一个Node类，Node对象 表示双向链表的一个点
class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }
    @Override
    public String toString() {
        return "Node name="+item ;
    }
}
