package com.javastu.threaduse;

/**
 * Created by e1hax on 2022/7/4.
 */
public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        /*
        源码解读
        (1)
        public synchronized void start() {
            strat0();
        }
        (2)
        //start0() 是本地方法，是JVM调用，底层是c/c++实现
        //真正实现多线程的效果，是 start0() ，而不是run
        private native void start0();

         */

        cat.start();//启动线程 -> 最终会执行cat 的 run 方法
//        cat.run();//run方法就是一个普通方法，没有真正启动一个线程，就会吧 run 方法执行完毕，才向下执行
        // 当 main 线程启动后创建了一个子线程 Thread - 0，主线程不会阻塞，会继续执行
        // 主线程 main 和子线程 Thread - 0 交替执行

        System.out.println("主线程继续执行");
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i="+i+"  主线程名称："+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

//1. 当一个类继承了 Thread 类，该类就可以当做线程使用
//2. 我们会重写run方法。写上自己的业务代码
//3. run  Thread 类 实现了 Runnable 接口的 run 方法
/*
        @Override
        public void run() {
            if (target != null) {
                target.run();
            }
        }
 */
class Cat extends Thread{

    int times = 0;
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        while (true){
        //该线程每隔一秒 在控制台输出 喵喵，我是小猫咪
        System.out.println("喵喵，我是小猫咪"+(++times)+"  线程名称:"+Thread.currentThread().getName());
        try {
            //让线程休眠 1 秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
        if (times >=80) {
          break;//当 times 等于 80  退出循环
        }
        }
    }
}
