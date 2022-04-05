package com.stu.Annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.当我们不希望看到警告时，可以用 SuppressWarnings 注解来抑制警告信息
 * 2.在{""} 中，可以写入希望抑制的警告信息
 * 3.可以指定的警告类型有 all控制所有警告，等，查阅文档
 * 4.SuppressWarnings的作用范围，跟注解的位置有关
 */

@SuppressWarnings({"all"})

public class SuppressWarningsDetails {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Jack");
        list.add("TOM");
        list.add("Mark");
        int i;
        System.out.println(list.get(1));
    }
}

