package com.javastu.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork02 {
    public static void main(String[] args) {

        /*
        使用ArrayList完成对对象Car {name, price}的各种操作
        1.add:添加单个元素
        2.remove:删除指定元素
        3.contains:查找元素是否存在
        4.size:获取元素个数
        5.isEmpty:判断是否为空
        6.clear:清空
        7.addAll:添加多个元素
        8.containsAll:查找多个元素是否都存在
        9.removeAll:删除多个元素
        使用增强for和迭代器来遍历所有的car ,需要重写Car的toString方法
         */
        Car bmw = new Car("BMW", 1000000);
        Car Benz = new Car("Benz", 1200000);
        ArrayList arrayList = new ArrayList();
        //添加
        arrayList.add(bmw);
        arrayList.add(Benz);

        //remove 删除
        //arrayList.remove(bmw);

        //contains 查找元素是否存在
        System.out.println(arrayList.contains("Audi"));

        //size 获取元素个数
        System.out.println(arrayList.size());

        //isEmpty 判断是否为空
        System.out.println(arrayList.isEmpty());

        //clear 清空
        // arrayList.clear();

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bmw);
        arrayList2.add(Benz);

        //addAll 添加多个元素
        //arrayList.addAll(arrayList2);

        //containsAll:查找多个元素是否都存在
        //arrayList.containsAll(arrayList2);

        //removeAll: 删除多个元素
        //arrayList.removeAll(arrayList2);

        //增强for遍历
        System.out.println("=====增强for遍历=====");
        for (Object obj :arrayList) {
            System.out.println(obj);
        }

        //迭代器遍历
        System.out.println("=====迭代器遍历=====");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

    }
}

class Car{
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}