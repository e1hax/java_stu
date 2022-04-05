package com.hspjava.exercise.Exercise04;

public class Employee {
    private String name;
    private double daySalary;
    private int workDay;

    public Employee(String name, double daySalary, int workDay) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDay = workDay;
    }

    public void SalaryPrint(){
        System.out.println("总工资："+daySalary*workDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", daySalary=" + daySalary +
                ", workDay=" + workDay +
                '}';
    }
}
