package com.stu.homework;

public class Homework05 {
    public static void main(String[] args) {
        //实例化一个 tang 对象，先传一个 Horse
        Person tang = new Person("tang",new  Horse());
        tang.common();
        tang.passRiver();
        tang.passRiver();
        tang.common();
        tang.passValcona();
        tang.common();
        tang.passRiver();
        tang.passValcona();
        tang.passValcona();
    }
}

interface Vehicles {
    public void work();
}

//交通工具Horse  Boat类
class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况下，使用马儿。。。");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("过河，使用船。。。");
    }
}
class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("过火焰山，使用飞机。。。");
    }
}

class VehiclesFactory {

    //马始终是同一匹马
    private static Horse horse = new Horse();//饿汉式
    //飞机是同一架飞机
    private static Plane plane = new Plane();
    private VehiclesFactory() {}

    //马始终是一匹马，没必要每次生成一匹新马
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane(){
        return plane;
    }

}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
        //vehicles instanceof Boat 判断 vehicles 是否为船
        //(1)如果vehicles是船，结果为真，取反为假，直接使用work
        //(2)如果vehicles是null，结果为假，取反，调用工厂获取一个马
        //(2)如果vehicles是马，结果为假，取反，调用工厂获取一个船
        if (!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if (!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void passValcona(){
        if (!(vehicles instanceof Plane)){
            vehicles=VehiclesFactory.getPlane();
        }
        vehicles.work();
    }
}
