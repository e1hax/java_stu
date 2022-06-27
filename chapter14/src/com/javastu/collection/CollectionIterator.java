package com.javastu.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Books("三国演义","罗贯中",10));
        col.add(new Books("小李飞刀","古龙",5.1));
        col.add(new Books("红楼梦","曹雪芹",34.6));

        //遍历col集合
        //1.先得到 col 对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环
        //使用iterator.next()遍历时，先用iterator.hasNext()判断集合中是否还有数据
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj="+obj);
        }
        // 3.当退出while循环后，这时候iterator迭代器只想最后一个元素
        //    iterator.next(); //直接使用会出现 NoSuchElementEception
        // 4.如果希望再次遍历，需要重置迭代器  iterator = col.iterator();
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
        return "books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
