package com.javastu.method_;

/**
 * Created by e1hax on 2022/7/5.
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws Exception{
        T2 t2 = new T2();
        Thread thread = new Thread(t2);
        thread.start();

        for (int i = 0; i < 10; i++) {
                System.out.println("hi "+ i);
                Thread.sleep(1000);
                if (i==5){
                    thread.join();
                }
        }
        System.out.println("主线程结束。。。");


    }
}

class T2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("子线程结束。。。");
    }
}
