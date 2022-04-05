package com.hspjava.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("Tom", 19, "Java工程师");
        person[1] = new Person("Jack", 21, "Python工程师");
        person[2] = new Person("Mary", 18, "Golang工程师");
//        for (int i = 0; i < person.length; i++) {
//            //默认toString方法，person[i].toString()
//            System.out.println(person[i]);
//        }

        Tool tool = new Tool();
        tool.bubble(person);

        for (int i = 0; i < person.length; i++) {
            //默认toString方法，person[i].toString()
            System.out.println(person[i]);
        }

    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

class Tool{
    public Person[] bubble(Person[] person){
        Person temp;
        for (int i = 0; i < person.length-1 ; i++) {
            for (int j = 0; j < person.length-i-1; j++) {
                if (person[j].getAge()>person[j+1].getAge()) {
                      temp=person[j];
                      person[j]=person[j+1];
                      person[j+1] = temp;
                }
            }
        }
        return person;
    }
}