package com.hspjava.exercise.exercise05;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void Print() {
        System.out.println(getName()+"\t总工资："+((getSalary()*12)+bonus));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
