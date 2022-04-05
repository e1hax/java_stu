package com.hspjava.exercise.exercise10;

public class Test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Tom", 28, "医生", "男", 9000);
        Doctor doctor2 = new Doctor("Tom", 28, "医生", "男", 9001);

        System.out.println(doctor1.equals(doctor2));
        System.out.println(doctor1);
        System.out.println(doctor2);
    }
}
