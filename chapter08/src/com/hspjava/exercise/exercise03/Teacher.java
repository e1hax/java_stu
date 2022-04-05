package com.hspjava.exercise.exercise03;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double level;

    public Teacher(String name, int age, String post, double salary,double level) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.level=level;
    }

    //方法introduce输出教师信息
    public void introduce() {
        System.out.println("\n姓名：" + name + "\n年龄：" + age +
                "\n职称：" + post + "\n基本工资：" + salary+"\n职称："+level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
}
