package com.javastu.try_;

public class TryCatchFinallyDetail {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b=0;
            int res = a/b;
            System.out.println(res);
        }finally {
            System.out.println("finally代码块被执行。");
        }
    }
}