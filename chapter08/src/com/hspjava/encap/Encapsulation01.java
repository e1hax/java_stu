package com.hspjava.encap;

import java.util.Scanner;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tom");
        person.setAge(24);
        person.setSalary(30000);
        person.setJob("java工程师");
        System.out.println(person.printInfo());
        System.out.println("请输入密码查看工资：");
        System.out.println("薪资："+person.getSalary());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("姓名为2-6个字符，默认姓名为：User");
            this.name = "User";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("输入错误，年龄在1-120之间，默认年龄18！！");
            this.age = 18;
        }

    }

    public double getSalary() {
        Scanner scanner = new Scanner(System.in);
        String passwd;
        passwd = scanner.next();
        if (passwd.equals("123456")) {
            return salary;
        }else
        return -1;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String printInfo() {
        return "信息：\n" + "姓名：" + name + "\n年龄：" + age  + "\n岗位：" + job;
    }
}
