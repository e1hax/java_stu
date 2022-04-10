package com.javastu.wrapper;

import javax.swing.*;

public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d =100d;   //自动装箱 Double.valueOf(100d)
        Float f = 1.5f;//自动装箱 Float.valueOf(1.5f)

        Object obj1 = true? new Integer(1):new Double(2.0);//三元运算法是一个整体 ，一真大师
        System.out.println(obj1);// 最高精度为double ，所以会输出 1.0

        Object obj2;
        if(true){
            obj2 = new Integer(1);
        }else{
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);//  每个语句都是独立的，最高精度 int   输出 1

    }
}
