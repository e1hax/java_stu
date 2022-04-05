package com.javastu.Exception_;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        try {
            int arr [] = {1,2,6,7,3};
            for (int i = 0; i <= arr.length ; i++) {
                System.out.println(arr[i]);
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("程序继续运行！！");
    }
}
