package com.javastu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integer = {10,20,50,30,25,15,67};
        //遍历数组,之前使用 for循环

        //直接使用Arrays.toString方法，显示数组
        System.out.println("排序前："+Arrays.toString(integer));


        //演示 sort 方法的使用
        // 1.可以直接使用冒泡， 也可以直接使用Arrays的sort方法
        // 2.应为数组是引用类型，所以通过sort排序后，直接影响到原数组
        // 3.sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
        // 4.调用 定制排序 时，通过创意两个参数 (1) interger (2)实现了Comparator接口的匿名内部类，要求实现 compare 方法
        // 5 看源码，源码分析
        // (1)  Arrays.sort(integer, new Comparator<Integer>()
        // (2) 最终到 TimSort类 private static <T> void binarySort(T[] a, int lo, int hi, int start,
        //                                       Comparator<? super T> c)
        // (3) 执行到binarySort 方法的代码，会根据动态绑定机制， c.compare() 执行我们传入的 匿名内部类的 compare()
        //   while (left < right) {
        //                int mid = (left + right) >>> 1;
        //                if (c.compare(pivot, a[mid]) < 0)
        //                    right = mid;
        //                else
        //                    left = mid + 1;
        //            }
        // (4) new Comparator<Integer>() {
        //            @Override
        //            public int compare(Integer o1, Integer o2) {
        //                Integer i1 = (Integer) o1;
        //                Integer i2 = (Integer) o2;
        //                return i2-i1;
        //            }
        //        }
        // (5) public int compare(Integer o1, Integer o2) 返回的值>0 还是 <0 会影响到整个排序结果

        //默认排序
        //Arrays.sort(integer);
        //System_.out.println("排序后："+Arrays.toString(integer));

        //定制排序  从大到小
        Arrays.sort(integer, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2-i1;
            }
        });
        System.out.println("排序后："+Arrays.toString(integer));

    }
}
