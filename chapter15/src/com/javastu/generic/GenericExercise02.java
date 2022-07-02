package com.javastu.generic;

import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class GenericExercise02 {
    public static void main(String[] args) {

        /*
        定义Employee类
        1)该类包含: private成员变 量name,sal,birthday,其中birthday为MyDate类的对象;
        2)为每一个属性定义getter, setter方法
        3)重写toString方法输出name, sal, birthday
        4) MyDate类包含: private成员变量month,day,year;并为每一个属性定义getter,setter方法;
        5)创建该类的3个对象，并把这些对象放入ArrayList集合中(ArrayList 需使用泛型来定义)，对集合中的元素进行排序，并遍历输出:
        排序方式:调用ArrayList 的sort方法，传入Comparator对象[使用泛型]，先按照name排序，如果name相同，则按生日日期的先后排序。( 即:定制排序]

         */

        Employee jack = new Employee("jack", 10000, new MyDate(7, 2, 2022));
        Employee mary = new Employee("mary", 13300, new MyDate(1, 2, 2022));
        Employee tom = new Employee("tom", 12000, new MyDate(6, 2, 2022));
        Employee jason = new Employee("jason", 20000, new MyDate(5, 2, 2022));


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(tom);
        employees.add(tom);
        employees.add(jason);
        employees.add(mary);
        System.out.println(employees);


        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        //遍历
        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }
}


class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.sal, sal) == 0 && Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }


    @Override
    public int compareTo(MyDate o) {
        //如果name相同  比较 year
        int yearMinus = year-o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //如果year相同  比较 Month
        int MonthMinus = month -o.getMonth();
        if (MonthMinus != 0) {
            return MonthMinus;
        }
        return day-o.getDay();
    }
}