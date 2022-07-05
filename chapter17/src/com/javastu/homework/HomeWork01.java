package com.javastu.homework;

import java.util.Scanner;

/**
 * Created by e1hax on 2022/7/5.
 */
public class HomeWork01 {
    public static void main(String[] args) {
        /*
            (1)在main方法中启动两个线程
            (2)第1个线程循环随机打印1-100以内的整数
            (3)直到第2个线程从键盘读取了"Q"命令
         */
        T1 t1 = new T1();
        T2 t2 = new T2(t1);
        t1.start();
        t2.start();
    }
}

class T1 extends Thread{
    static boolean flag = true;
    @Override
    public void run() {
        while (flag){
                System.out.println( " T1线程  1-100以内整数：  "+(int)(Math.random()*100+1));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }

    public  void setFlag(boolean flag) {//修改 flag 的值
        T1.flag = flag;
    }
}

class T2 extends Thread  {
    private T1 t1;
    private Scanner myScanner =  new Scanner(System.in);

    public T2(T1 t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        while (true){
            //接收到用户输入
            System.out.println("请输入你的指令(Q)表示退出");
            char key = myScanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                t1.setFlag(false);
                System.out.println("T2 线程退出");
                break;
            }
        }
    }



}

