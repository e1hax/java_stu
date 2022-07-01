package com.javastu.homework;

import java.awt.image.TileObserver;
import java.util.HashSet;
import java.util.Objects;

public class HomeWork06 {
    public static void main(String[] args) {
        //已知: Person类按照id和name重写了hashCode和equals方法，问下面代码输出什么?

        HashSet set = new HashSet();//ok
        Person2 p1 = new Person2(1001," AA");//ok
        Person2 p2 = new Person2(1002,"BB");//ok
        set.add(p1);//ok
        set.add(p2);//ok
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person2(1001,"CC"));
        System.out.println(set);
        set.add(new Person2(1001,"AA"));
        System.out.println(set);

    }
}

class Person2{
    public int id ;
    public String name ;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return id == person2.id && Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
