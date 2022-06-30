package com.javastu.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise01 {
    public static void main(String[] args) {
        /*
        使用HashMap添加3个员工对象，要求
        键:员工id
        值:员工对象
        并遍历显示工资> 18000的员工(遍历方式最少两种)
        员工类:姓名、工资、员工id
         */

        Map map = new HashMap ();
        map.put("01",new Employee("Jack",17000,"01"));
        map.put("02",new Employee("Tom",18500,"02"));
        map.put("03",new Employee("Jeam",27000,"03"));

        // keySet
        // 增强for
        System.out.println("-----keySet 增强for-----");
        Set keySet = map.keySet();
        for (Object key :keySet) {
           Employee em = (Employee) map.get(key);
           if (em.getSalary()>18000){
               System.out.println(key+" - "+em);
           }
        }
        //迭代器
        System.out.println("-----keySet 迭代器-----");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Employee em = (Employee) map.get(key);
            if (em.getSalary()>18000){
                System.out.println(key+" - "+em);
            }
        }

        //EntrySet
        // 增强for
        System.out.println("-----Entry 增强for-----");
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            Map.Entry kv = (Map.Entry) entry;
            Employee em = (Employee) kv.getValue();
            if (em.getSalary()>18000){
                System.out.println(kv.getKey()+" - "+em);
            }
        }

        //迭代器
        System.out.println("-----Entry 迭代器-----");
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object entry =  iterator1.next();
            Map.Entry kv = (Map.Entry) entry;
            Employee em = (Employee) kv.getValue();
            if (em.getSalary()>18000){
                System.out.println(kv.getKey()+" - "+em);
            }
        }

    }
}

class Employee{
    private String name;
    private double salary;
    private String id;

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}
