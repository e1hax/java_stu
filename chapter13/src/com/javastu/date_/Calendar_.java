package com.javastu.date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        // 1. Calender类是一个抽象类，并且构造器是 private
        // 2. 可以通过getInstance() 来获取
        // 3. 可以提供大量的方法和字段
        // 4. Calendar 没有提供对应的格式化的类，需要自己组合
        // 5. 24小时进制来获取时间  HOUR 换成  HOUR_OF_DAY
        Calendar c = Calendar.getInstance();//创建日历类对象
        System.out.println("c="+c);
        // 获取日历对象的某个日历字段
        System.out.println("年："+ c.get(Calendar.YEAR));
        // +1 是因为Calendar 返回月的时候， 是按照 0 开始编号
        System.out.println("月："+ c.get(Calendar.MONTH)+1);
        System.out.println("日："+ c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时："+ c.get(Calendar.HOUR));
        System.out.println("分钟："+ c.get(Calendar.MINUTE));
        System.out.println("秒："+ c.get(Calendar.SECOND));

        // Calendar 没有专门的格式化方法，所以需要自己来组合
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
                c.get(Calendar.DAY_OF_MONTH)+"日"+c.get(Calendar.HOUR_OF_DAY)+"时"+
                c.get(Calendar.MINUTE)+"分"+c.get(Calendar.SECOND)+"秒");
    }
}
