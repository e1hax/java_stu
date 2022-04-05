package com.hspjava.encap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Account {
    private String name;
    private double balance;
    private String passwd;

    public Account() {
    }

    public Account(String name, double balance, String passwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPasswd(passwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名不合法，长度应为2-4个字符，默认值为user");
            this.name = "user";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20，给予默认值21");
            this.balance = 21;
        }
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {

        if (passwd.length() == 6) {
            this.passwd = passwd;
        } else {
            System.out.println("密码必须为6位，默认密码123456");
            this.passwd = "123456";
        }
    }

    public void Info(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码：");
        String passwd = scanner.next();
        if (passwd.equals(this.passwd)) {
            System.out.println("姓名："+name+"\n余额："+balance);
        }else{
            System.out.println("你无权查看！！！");
        }

    }
}
