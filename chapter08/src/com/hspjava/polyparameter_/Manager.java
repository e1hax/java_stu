package com.hspjava.polyparameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    //重写getAnnual方法
    @Override
    public double getAnnual(){
        return super.getAnnual()+ bonus;
    }

    //manager方法
    public void manager(){
        System.out.println("总经理"+getName()+"正在开会。。。");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
