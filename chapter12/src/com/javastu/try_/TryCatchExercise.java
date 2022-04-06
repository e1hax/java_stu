package com.javastu.try_;

import java.util.Scanner;

public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int num = 0;
        String inputstr = "";
        while (true) {
            System.out.println("请输入一个整数：");
            inputstr = myscanner.next();
            try {
                num = Integer.parseInt(inputstr);//可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }
        System.out.println("你输入的是："+num);

    }
}
