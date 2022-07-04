package com.javastu.threaduse;

/**
 * Created by e1hax on 2022/7/4.
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start(); // 此处不能调用start

        //创建 Thread 对象，把dog对象(实现Runable)，放入Thread
//        Thread thread = new Thread(dog);
//        thread.start();

        //使用Proxy
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Animal{}
class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫");
    }
}

//线程代理类  模拟了一个极简的Thread
class ThreadProxy implements Runnable{//可以把Proxy类当做 ThreadProxy
    private Runnable target = null;
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}

class Dog implements Runnable{//通过 Runnable 接口，开发线程
    int count=0;
    @Override
    public void run() {
        while (true){
            System.out.println("小狗汪汪叫 "+(++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}