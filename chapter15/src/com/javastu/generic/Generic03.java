package com.javastu.generic;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<>("jack");
    }
}

//泛型的作用是：可以在类声明时通过一个标识标识类中某个属性的类型，
// 或者是某个方法的返回值类型，或者是参数类型。
class Person<E>{
    E s;//E 表示s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型

    public Person(E s) {//E 也可以是参数类型
        this.s = s;
    }
    public E f(){// 返回类型也可以使用E
        return s;
    }
}