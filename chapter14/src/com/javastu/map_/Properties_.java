package com.javastu.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        //1. Properties 继承 HashTable
        //2. 可以通过 k-v 存放数据， key和value不能为null
        Properties properties = new Properties();
        properties.put("jhon",100);//OK
//        properties.put(null,100);//异常 NullPointerException
//        properties.put("jhon",null);//异常 NullPointerException
        properties.put("lucy",100);//OK
        properties.put("lic",100);//OK
        properties.put("lic",88);//替换

        System.out.println("properties="+properties);

        // 通过对应k  获取对应值
        System.out.println(properties.get("lic"));

        //删除
        properties.remove("lic");
        System.out.println("properties="+properties);

        //修改
        properties.put("lucy",99);
        System.out.println("properties="+properties);

        //查找
        System.out.println( properties.getProperty("jhon"));

    }
}
