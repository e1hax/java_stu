package com.javastu.list_;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Books("红楼梦","曹雪芹",100));
        list.add(new Books("西游记","吴承恩",10));
        list.add(new Books("水浒传","施耐庵",30));
        list.add(new Books("三国演义","罗贯中",80));
        list.add(new Books("西游记","吴承恩",109));

        babbleSort(list);


        //迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj.toString());
        }



    }
    //静态方法
    public static List babbleSort(List list){
        List temp = new ArrayList();
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j <list.size()-1-i; j++) {
                //取出对象，向下转型
                Books book1 = (Books) list.get(j);
                Books book2 = (Books) list.get(j+1);
                if (book1.getPrice()> book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j+1,book1);
                 }
            }
        }
        return list;
    }
}
class Books{
    private String name;
    private String author;
    private double price;

    public Books(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称："+name+"\t \t作者："+author+"\t \t价格："+price;
    }
}

