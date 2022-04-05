package com.hspjava.exercise.Exercise04;

public class Exercise04 {
    public static void main(String[] args) {
        Employee tom = new Manager("Tom", 500, 25);
        Employee jack = new Worker("Jack",300,25);

        System.out.println(tom);
        System.out.println(jack);

        tom.SalaryPrint();
        jack.SalaryPrint();
    }
}
