package com.hspjava.smallchange;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class SmallChangeSys {
    public static void main(String[] args) {
        //化繁为简
        //1.显示菜单，并可以选择，进行对应的显示
        //2.零钱通明细
        //3.收益入账
        //4.消费
        //5.退出
        //6.退出功能完善

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        char key;

        //2.零钱通明细,使用字符串拼接
        String detail = "---------------零钱通明细---------------";

        //3. 完成收益入账
        //定义变量
        double money = 0;
        double balance = 0;
        //定义时间变量
        Date date = null;
        //对获取的时间进行格式更改
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm");

        //4.完成消费
        //定义变量
        String instruction;//消费说明

        // 1.显示菜单
        do {
            System.out.println("\n---------------零钱通菜单---------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请输入选项(1-4)：");
            key = scanner.next().charAt(0);

            switch (key) {
                case '1':
                    System.out.println(detail);
                    break;
                case '2':
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    //找出输入金额有误的情况
                    if (money <= 0) {
                        System.out.println("收益金额需大于 0 ");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case '3':
                    System.out.print("消费说明：");
                    instruction = scanner.next();
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    //找出输入金额有误的情况
                    if (money<0 || money>balance){
                        System.out.println("您的消费金额应该在 1-"+balance+"之间");
                        break;
                    }
                    balance -= money;
                    date = new Date();
                    detail += "\n" + instruction + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;

                case '4':
                    //定一个一个变量来接受输入的字符串
                    String choice = "";
                    while (true) {
                        System.out.println("你确定要退出么？y/n");
                        choice = scanner.next();
                        if (choice.equals("y") || choice.equals("n")) {
                            break;
                        }
                    }
                    //判断是否输入为y
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop);
        System.out.println("零钱通系统退出~~");
    }
}
