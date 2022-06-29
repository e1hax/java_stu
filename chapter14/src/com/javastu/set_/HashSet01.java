package com.javastu.set_;



import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        // 1. 在执行add方法后会返回一个 boolean值
        // 2. 添加成功放回 ture ，失败返回false
        // 3.可以通过 remove 输出指定元素
        System.out.println(set.add("jack"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("rose"));

        set.remove("rose");
        System.out.println("set = "+set);


        //重置 set
        set = new HashSet();
        System.out.println("set="+set);
        // 4.HashSet 不能添加相同的元素/数据
        set.add("lucy");//正常加入
        set.add("lucy");//不能加入
        set.add(new Dog("tom"));//正常加入
        set.add(new Dog("tom"));//正常加入，因为是两个不同的对象
        System.out.println("set = "+ set);

        //加深 经典面试题
        // 源码分析
        set.add(new String("jhon"));//OK
        set.add(new String("jhon"));//加入不了
        System.out.println("set = " +set);
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}