package com.hspjava.exercise.exercise05;

public class Test {
    public static void main(String[] args) {
       Employee worker =  new Worker("Tom",4000);
        Employee farmer =  new Farmer("Jack",2000);
        Employee teacher =  new Teacher("Jack",2000,20);
        Employee scientist = new Scientist("Mary",8000,50000);
        Employee waiter = new Waiter("Jane",3000);

        System.out.println(worker+"\n"+farmer+"\n"+teacher+"\n"+scientist+"\n"+waiter);

        worker.Print();
        farmer.Print();
        teacher.Print();
        scientist.Print();
        waiter.Print();

    }
}
