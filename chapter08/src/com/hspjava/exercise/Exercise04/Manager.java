package com.hspjava.exercise.Exercise04;

public class Manager extends Employee{
    public Manager(String name, double daySalary, int workDay) {
        super(name, daySalary, workDay);
    }

    @Override
    public void SalaryPrint() {
        System.out.println("总工资："+(1000+((getDaySalary()*getWorkDay())*1.2)));
    }
}
