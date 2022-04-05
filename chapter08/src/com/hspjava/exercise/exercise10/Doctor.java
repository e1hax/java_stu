package com.hspjava.exercise.exercise10;

import java.util.Objects;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double salary;

    public Doctor(String name, int age, String job, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Doctor){
            Doctor d = (Doctor) obj;
            if (this.name.equals(d.name) && this.age == d.age &&
                    this.gender.equals(d.gender)&&this.job.equals(d.job) &&
                    this.salary == d.salary){
                return true;
            }
        }
        return  false;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
