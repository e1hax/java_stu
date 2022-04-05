package com.hspjava.single_;

/**
 * 懒汉式的单例模式
 */


public class SingleTon2 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

    }
}

//在此程序中只能创建一个对象
//使用单例模式
class Cat{
        private  String name;
        private static Cat cat;
    /**
     * 1.创建一个静态的构造器
     * 2.定义一个static 的静态属性对象
     * 3.提供一个public的Static方法，用来返回一个cat对象
     * 4.当用户使用这个getInstance方法时，才返回cat对象，然后再次调用时，会返回上次创建的对象
     */
    private Cat(String name) {
        System.out.println("构造方法被调用");
        this.name = name;
    }
    public static Cat getInstance(){
        if (cat == null){   //判断cat对象是否被创建
            cat = new Cat("大黄");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
