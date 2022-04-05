package com.hspjava.exercise.exercise03;

public class AssProfessor extends Teacher{
    public AssProfessor(String name, int age, String post, double salary,double level) {
        super(name, age, post, salary,level);
    }

    public void introduce() {
        System.out.print("\n这是副教授的工资：");
        super.introduce();
        System.out.println("总工资："+getSalary()*getLevel());
    }

}



