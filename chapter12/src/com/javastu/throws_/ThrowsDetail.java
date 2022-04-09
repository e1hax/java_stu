package com.javastu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) throws ArithmeticException{
        f2();
    }

    public static void  f2() throws ArithmeticException{
        //1.对于编译异常，程序必须处理，比如 try-catch 和 throws
        //2.对于运行异常，程序中如果没有处理，默认就是 throws 的方式处理
        int n1 = 10;
        int n2 = 0;
        double res = n1/n2;
    }

    public  static void f1() throws FileNotFoundException{
        //为什么调用f3方法会报错：
        // 1. f3() 方法抛出一个编译异常
        // 2. 这时，就需要 f1() 必须去处理这个编译异常
        // 3. f1()可以try-catch-finally ，或者继续 throws 编译异常
        f3();  //抛出异常
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream fil = new FileInputStream("D://new.txt");
    }

    public  static void f4()  {
        //为什么调用f5方法不会报错：
        // 1. 在f4()中调用方法 f5() 是正常的
        // 2. 原因是 f5() 抛出的是运行异常
        // 3. java中，并不要求程序员显示处理运行异常，因为有默认处理机制
        f5();  //抛出异常
    }

    public static void f5() throws RuntimeException {}
}

class Father{
    public void method() throws RuntimeException{

    }
}

class Son extends Father{
    // 3. 子类重写父类的方法时，对抛出异常的规定：子类重写的方法，所抛出的异常类型要么和父类的异常类型一致，
    // 要么为父类抛出异常类型的子类型
    // 4. 在throws 过程中，如果方法 try-catch ，就相当于处理异常，就可以不必 throws
    @Override
    public void method() throws RuntimeException {
    }
}
