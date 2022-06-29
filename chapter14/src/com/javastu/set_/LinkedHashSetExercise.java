package com.javastu.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓",100000));
        linkedHashSet.add(new Car("奥迪",600000));
        linkedHashSet.add(new Car("法拉利",1100000));
        linkedHashSet.add(new Car("奥迪",600000));
        linkedHashSet.add(new Car("奥迪",300000));

        System.out.println("linkedHashSet="+linkedHashSet);

    }
}

class Car{
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}
