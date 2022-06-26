package com.javastu.homework;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        /**
         * 输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
         * 要求:
         * (1)用户名长度为2或3或4
         * (2)密码的长度为6，要求全是数字isDigital
         * (3)邮箱中包含@和.   并且@在.的前面
         *
         * 思路分析
         * 1. 先编写方法 userRegister
         * 2. 针对 输入的内容进行校验，如果发现有问题 则抛出异常
         * 3. 单独写一个方法 判断是否全是数字
         */

        String name = "jack";
        String pwd = "123456";
        String email = "forest_fun@163.com";

        try {
            userRegister(name, pwd, email);
            System.out.println("注册成功！！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name, String pwd, String email) {
        //检验用户名
        int userLenght = name.length();
        if (!(userLenght >= 2 && userLenght <= 4)) {
            throw new RuntimeException("用户名长度为2-4");
        }

        //校验密码长度
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度为6 且全为数字");
        }

        //检验邮箱
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮件不符合要求");
        }

    }

    // 检测是否全为数字的方法
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}

