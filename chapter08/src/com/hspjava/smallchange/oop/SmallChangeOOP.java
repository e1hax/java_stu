package com.hspjava.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    //化繁为简
    //1.显示菜单，并可以选择，进行对应的显示
    //2.零钱通明细
    //3.收益入账
    //4.消费
    //5.退出
    //6.退出功能完善

    //主菜单属性
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key;

    //零钱通明细属性
    String detail = "---------------零钱通明细---------------";

    //零钱通收益、消费属性
    double money;
    double balance;
    String note;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //退出方法属性
    String chioce;


    //显示主菜单方法
    public void mainMeun() {

        do {
            System.out.println("\n---------------零钱通菜单---------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请输入选项(1-4)：");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.note();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入！！");
            }
        } while (loop);
    }

    //零钱通明细方法
    public void note() {
        System.out.println(detail);
    }

    //零钱通收益方法
    public void income() {
        System.out.print("收益金额：");
        money = scanner.nextDouble();
        //金额输入错误的情况
        if (money <= 0) {
            System.out.println("收益金额必须大于 0");
            return;
        }
        balance += money;
        date = new Date();
        //明细 detail 字符串拼接
        detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
    }

    //消费方法
    public void pay() {
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额有误，应该在1-" + balance + "之间");
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        detail += "\n" + note + "\t-" + money +"\t"+ sdf.format(date) + "\t余额" + balance;

    }

    //退出方法
    public void exit() {
        while (true) {
            System.out.println("你确定要退出么？y/n");
            chioce = scanner.next();
            if (chioce.equals("y") || chioce.equals("n")) {
                break;
            }
        }
        if (chioce.equals("y")) {
            loop = false;
            System.out.println("零钱通系统退出~~");
            return;
        }
    }

}
