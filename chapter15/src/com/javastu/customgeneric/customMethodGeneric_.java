package com.javastu.customgeneric;

public class customMethodGeneric_ {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100);//调用方法时，传入参数，编译器，就会确定类型

        Fish<String, Double> fish = new Fish<>();
    }
}

//泛型方法，可以定义在普通类中，也可以定义在泛型类中
class Car{//普通类
    public void run(){}//普通方法

    public <T,R> void fly(T t,R r){}// 泛型方法
}

class Fish<T,R>{
    public void run(){}//普通方法

    public <U,M> void fly(U u,M m){}// 泛型方法

    public void hi(T r){}//不是泛型方法，而是使用了泛型
}
