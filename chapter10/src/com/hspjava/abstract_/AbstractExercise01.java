package com.hspjava.abstract_;


public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager tom = new Manager("Tom",001,5000,2000);
        CommonEmployee jack = new CommonEmployee("jack",001,3500);
        tom.work();
        jack.work();
    }
}

abstract class Employee{
    private String name;
    private int id;
    private  double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("经理"+getName()+"工作中");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

class CommonEmployee extends Employee{

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work(){
        System.out.println("员工"+ getName() +"工作中");
    }


}
