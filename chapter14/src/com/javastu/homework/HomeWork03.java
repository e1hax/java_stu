package com.javastu.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork03 {
    public static void main(String[] args) {
        /*
        按要求完成下列任务
        1)使用HashMap类实例化一个Map类型的对象m,键(String) 和值(int) 分别用于存储员
        工的姓名和工资，存入数据如下:
               jack  650元; tom  1200元; smith  2900元;
        2)将jack的工资更改为2600元
        3)为所有员工工资加薪100元;
        4)遍历集合中所有的员工
        5)遍历集合中所有的工资
         */

        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        //  将jack的工资更改为2600元
        m.put("jack",2600);
        System.out.println(m);
        //为所有员工工资加薪100元;


        // 视屏方法

        Set keySet = m.keySet();
        for (Object key :keySet) {
            m.put(key,(Integer)m.get(key)+100);
        }
        System.out.println(m);


        //调用entrySet
        Set entryset = m.entrySet();
        for (Object o :entryset) {
            Map.Entry o1 = (Map.Entry) o;
            m.put(o1.getKey(),(int)o1.getValue()+100);
        }
        System.out.println(m);

        for (Object obj :entryset) {
            Map.Entry o1 = (Map.Entry) obj;
            System.out.println("员工姓名："+o1.getKey());
            System.out.println("员工工资："+o1.getValue());
        }


    }
}
