package com.hspjava.exercise.exercise13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public String teach(){
        return  "我承诺，我会好好教学！！";
    }

    @Override
    public String play() {
        return "\n"+getName()+"爱玩象棋";
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
