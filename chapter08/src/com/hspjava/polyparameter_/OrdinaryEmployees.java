package com.hspjava.polyparameter_;

public class OrdinaryEmployees extends Employee {

    public OrdinaryEmployees(String name, double salary) {
        super(name, salary);
    }

    //重写getAnnual方法
    @Override
    public double getAnnual(){
        return super.getAnnual();
    }

    //work方法
    public void work(){
        System.out.println("员工"+getName()+"正在工作。。。");
    }


}
