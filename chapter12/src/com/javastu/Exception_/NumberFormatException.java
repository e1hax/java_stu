package com.javastu.Exception_;

public class NumberFormatException {
    public static void main(String[] args) {
        String name = "Jack哈哈";
        int num = Integer.parseInt(name);  //字符串转换为int，出现异常
    }
}
