package com.hspjava.exercise.exercise05;

public class Teacher  extends  Employee{
    private double daySalary;

    public Teacher(String name, double salary, double daySalary) {
        super(name, salary);
        this.daySalary = daySalary;
    }

    @Override
    public void Print() {
        System.out.println(getName()+"\t总工资："+((getSalary()*12)+(daySalary*365)));
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }
}
