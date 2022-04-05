package com.stu.homework;

public class Homework01 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();

        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());

    }
}

class Frock{
    private static int currentNum = 100000;
    private  int SerialNumber;

    public Frock() {
        SerialNumber=getNextNum();
    }

    public  static int getNextNum(){
        return currentNum +=100;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }


}

