package com.javastu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("新西游记",90);
        books[2] = new Book("水浒传续集",50);
        books[3] = new Book("三国演义在三国",60);

        //定制排序，price 从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1= (Book) o1;
                Book b2= (Book) o2;
                return (int)(b1.getPrice()- b2.getPrice());
            }
        });
        System.out.println(Arrays.toString(books));

        //定制排序，price 从小到大
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1= (Book) o1;
                Book b2= (Book) o2;
                return (int)(b2.getPrice()- b1.getPrice());
            }
        });
        System.out.println(Arrays.toString(books));

        //定制排序，书名长度 从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1= (Book) o1;
                Book b2= (Book) o2;
                return b2.getName().length()- b1.getName().length() ;
            }
        });
        System.out.println(Arrays.toString(books));

    }
}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
