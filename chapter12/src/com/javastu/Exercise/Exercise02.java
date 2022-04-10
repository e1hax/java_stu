package com.javastu.Exercise;

public class Exercise02 {
    public static void main(String[] args) {
        //args.length = 0
        //这里发生的是 ArrayIndexOutOfBoundsException
        try {
            if(args[4].equals("Jhon")){ //可能出现 NullPointerException 异常
                System.out.println("AA");
            }else {
                System.out.println("BB");
            }
            Object o = args[2];//String-->Object 向上转型
            Integer i = (Integer) o; //向下转型，出现 ClassCastException
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

