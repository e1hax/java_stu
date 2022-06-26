package com.javastu.date_;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        // 1. 使用now()返回当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 2. 使用 DateTimeFormatter 对象来进行格式化
        // 创建DateTimeFormatter对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);

        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();

        // plus和 minus 方法可以对当前时间进行加或者减
        // 890天后是什么时候，把年月日时分秒输出
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后 ： "+dateTimeFormatter.format(localDateTime));

        // 3456分钟前  是什么时候
        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        System.out.println("3456分钟前 ： "+dateTimeFormatter.format(localDateTime2));


        System.out.println("年："+ldt.getYear());
        System.out.println("月："+ldt.getMonthValue());
        System.out.println("日："+ldt.getDayOfMonth());
        System.out.println("时："+ldt.getHour());
        System.out.println("分："+ldt.getMinute());
        System.out.println("秒："+ldt.getSecond());
    }
}
