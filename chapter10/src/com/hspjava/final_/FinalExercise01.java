package com.hspjava.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        double area = circle.Area();
        System.out.println("Area is "+ area);

    }
}

class Circle{
    private double radius;      //圆的半径
    private final double PI=3.14;  //PI为固定值，用final来定义

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area(){
        return radius*PI;
    }
}
