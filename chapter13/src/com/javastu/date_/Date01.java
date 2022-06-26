package com.javastu.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {

        //1. 获取当前系统时间
        //2. Date类是 java.util包
        //3. 默认输出日期的格式是国外的方式，因此通常需要对日期格式进行转换
        Date date = new Date();//获取当前时间
        System.out.println("当前时间="+date);
        Date date2 = new Date(9853223);//指定毫秒数得到时间
        System.out.println(date2);

        // 1.创建 SimpleDateFormat 对象，可以指定格式
        // 2.这里格式里面的字母是规定好了的，不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日 hh:mm:ss E");
        String format = sdf.format(date);
        // format : 将日期转换成指定格式的字符串
        System.out.println("当前时间="+format);

        // 1.可以把一个格式化的 String 转换成相对应的格式
        // 2.得到 Date 任然在输出时，还是按照国外的形式，如果希望指定格式输出，需要转换
        // 3.在把 String -> Date ，使用的 sdf 格式需要和你给的String的格式一样，否则会抛出一个转换异常
        String s = "2022年18月26日 03:18:21 周日";
        Date parse = sdf.parse(s);
        System.out.println("parse="+sdf.format(parse));
        System.out.println("parse="+parse);
    }
}
