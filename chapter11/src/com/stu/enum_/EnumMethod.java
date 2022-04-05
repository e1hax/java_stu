package com.stu.enum_;

public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;

        //输出枚举对象的名字
        System.out.println(autumn.name());
        // ordinal() 输出的是该枚举对象的次序/编号，从0 开始编号
        //AUTUMN 枚举对象是第三个，因此输出 2
        System.out.println(autumn.ordinal());
        //从反编译可以看出 values 方法，返回 Season2[]
        //含定义的所有枚举对象
        Season2[] values = Season2.values();
        System.out.println("遍历取出枚举对象：");
        for (Season2 season:values) {//增强for循环
            System.out.println(season);
        }

        //valueof
        // 执行流程
        /**
         * 1. 根据输入的 “AUTUMN" 到 season2 的枚举对象去查找
         * 2. 如果找到了，就返回，没找到就报错
         * **/

        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn1);
        System.out.println(autumn == autumn1);

        // compareto ：比较两个枚举常量，比较的就是编号

        System.out.println(Season2.AUTUMN.compareTo(Season2.SPRING));


    }
}
