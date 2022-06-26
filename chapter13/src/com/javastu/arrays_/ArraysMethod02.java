package com.javastu.arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {10,22,35,45,46,76};

        //binarySearch 通过二分搜索法进行查找，要求必须排序好
        // 1.使用 binarySearch 二分搜索法
        // 2.要求该数组是有序的，如果是无序的，不能使用binarySearch
        // 3.如果数组中不存在该元素，就返回 -1
        int index = Arrays.binarySearch(arr,45);
        System.out.println(index);


        // copyOf 数组元素的复制
        // 1.从一个数组拷贝到arr.lenght长的新数组中
        // 2.如果拷贝的长度> arr.length 就在新数组的后面增加null
        // 3.如果拷贝长度< 0就抛出异常NegativeArraySizeException
        // 4.该方法的底层使用的是System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println("拷贝好 newArr： "+Arrays.toString(newArr));

        //fill 数组元素的填充
        Integer[] num = new Integer[]{9,3,2};
        //1. 使用 99 去填充 num 数组，可以理解成是替换原来的所有元素
        Arrays.fill(num,99);
        System.out.println("填充后 num ："+Arrays.toString(num));

        //equals 比较两个数组的元素内容是否一致
        Integer[] arr2 = {10,22,35,45,46,75};
        boolean equals =  Arrays.equals(arr,arr2);
        System.out.println(equals);

        // asList 将一组值，转换成list
        //1. asList 方法，会将(2,3,5,6,4,2,1)转换为一个List集合
        //2. 返回 asList 编译类型 List(接口)
        //3. asList运行类型 java.util.Arrays$ArrayList，就是Arrays类的静态内部类
        //   private static class ArrayList<E> extends AbstractList<E>
        //        implements RandomAccess, java.io.Serializable
        List asList = Arrays.asList(2,3,5,6,4,2,1);
        System.out.println("asList = "+asList);
        System.out.println("asList 运行类型"+asList.getClass());
    }
}
