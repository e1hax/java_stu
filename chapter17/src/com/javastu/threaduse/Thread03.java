package com.javastu.threaduse;

/**
 * Created by e1hax on 2022/7/4.
 * main线程启动两个子线程
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t1);
        Thread thread2 = new Thread(t2);
        //启动第一个线程
        thread.start();
        //启动第二个线程
        thread2.start();

    }
}

class  T1 implements Runnable{

    int count = 0;
    @Override
    public void run() {
        //每隔一秒输出一个 hello world 输出 十次
        while (true) {
            System.out.println("hello world! "+(++count)+"  "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count ==60) {
                break;
            }
        }
    }
}

class  T2 implements Runnable{

    int count = 0;
    @Override
    public void run() {
        //每隔一秒输出一个 hello world 输出 十次
        while (true) {
            System.out.println("hi! "+(++count)+"  "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count ==50) {
                break;
            }
        }
    }
}
