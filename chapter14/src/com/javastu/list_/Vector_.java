package com.javastu.list_;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        // 无参构造
        Vector vector = new Vector();
//      Vector list = new Vector(8);
        //使用for给list集合添加 1-10 数据
        for (int i = 1; i <=10; i++) {
            vector.add(i);
        }

    }
}
