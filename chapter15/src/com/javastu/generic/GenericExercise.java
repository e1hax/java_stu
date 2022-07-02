package com.javastu.generic;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        Student jack = new Student("01", "jack");
        Student tom = new Student("02", "tom");
        Student jason = new Student("03", "jason");
        //  HashSet
        HashSet<Student> set_students = new HashSet<>();
        set_students.add(jack);
        set_students.add(tom);
        set_students.add(jason);

        //迭代器遍历
        System.out.println("======HashSet 迭代器====");
        Iterator<Student> iterator = set_students.iterator();
        while (iterator.hasNext()) {
            Student next =  iterator.next();
            System.out.println(next.getName()+" - "+next.getId());
        }

        //增强for
        System.out.println("======HashSet 增强for====");
        for (Student student :set_students) {
            System.out.println(student.getName()+" - "+student.getId());
        }

        // HashMap
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("jack",jack);
        stringStudentHashMap.put("tom",tom);
        stringStudentHashMap.put("jason",jason);

        //迭代器遍历
        System.out.println("======HashMap 迭代器====");
        Set<Map.Entry<String, Student>> entrySet = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Student> next =  iterator2.next();
            System.out.println(next.getKey()+" - "+next.getValue());
        }


        //增强for
        System.out.println("======HashMap 增强for====");
        for (Map.Entry<String, Student> student :entrySet) {
            System.out.println(student.getKey()+" - "+student.getValue());
        }


    }
}

class Student{
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
