package com.hspjava.exercise.exercise13;

public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[4];

        person[0] = new Student("Tom", "男", 22, "20180706");
        person[1] = new Student("Jam", "男", 20, "20200708");
        person[2] = new Teacher("Mary", "女", 35, 10);
        person[3] = new Teacher("Jason", "男", 34, 8);

        Person temp;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }

//        toString()
//        for (int i = 0; i < person.length; i++) {
//            System.out.println(person[i]);
//        }

        Test test = new Test();
        for (int i = 0; i < person.length; i++) {
            test.call(person[i]);
        }
    }

    public void call(Person person) {
        if (person instanceof Student) {
            System.out.println("学生信息如下：\n姓名："+person.getName()+
                    "\n年龄："+ person.getAge()+
                    "\n性别："+person.getSex()+
                    "\n学号："+((Student) person).getStu_id()+
                    "\n"+((Student) person).study()+person.play());
            System.out.println("=====================");

        } else if (person instanceof Teacher) {
            System.out.println("老师信息如下：\n姓名："+person.getName()+
                    "\n年龄："+ person.getAge()+
                    "\n性别："+person.getSex()+
                    "\n工龄："+((Teacher) person).getWork_age()+
                    "\n"+((Teacher) person).teach()+person.play());
            System.out.println("=====================");

        }
    }
}
