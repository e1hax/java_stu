package com.stu.homework;

public class Homework03 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(
                new Calc() {
            @Override
            public double work(double a, double b) {
                return a + b;
            }
        },8,10);
    }
}


interface Calc{
    public double work(double a, double b);
}

class Cellphone {
    public void testWork(Calc calc,double a,double b){
        double result =  calc.work(a,b);
        System.out.println("计算结果为："+result);
    }


}
