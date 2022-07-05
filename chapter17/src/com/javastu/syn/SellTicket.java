package com.javastu.syn;

/**
 * Created by e1hax on 2022/7/4.
 * 使用多线程，模拟三个窗口同时售票100张
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();//启动线程
//        sellTicket02.start();
//        sellTicket03.start();

//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();

        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
    }
}

//使用 Runnable 方式 ,使用 synchronize实现线程同步

class  SellTicket03 implements Runnable{
    private int ticketnum =100;//让多个线程共享 ticketnum

    private boolean loop = true;

    //1. public synchronized void sell(){}  是一个同步方法
    //2. 这时锁在 this 对象
    //3. 也可以在代码块上写 synchronized ，同步代码块，互斥锁还是在this 对象

    public /*synchronized*/ void sell(){//在同一时刻，只能有一个线程来执行sell方法
        synchronized (this){
            if (ticketnum <= 0) {
                System.out.println("售票结束。。。");
                loop = false;
                return;
            }
            //休眠 50 ms
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口 "+Thread.currentThread().getName() +" 售出一张票 "+"剩余票数="+(--ticketnum));
        }
    }

    @Override
    public  void run() {
        while (loop){
            sell();
        }
    }
}



//使用 Thread 方式
class  SellTicket01 extends Thread{
    private static int ticketnum =100;//让多个线程共享 ticketnum
    @Override
    public void run() {
        while (true){
            if (ticketnum <= 0) {
                System.out.println("售票结束。。。");
                break;
            }
            //休眠 50 ms
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 "+Thread.currentThread().getName() +" 售出一张票 "+
                    "剩余票数="+(--ticketnum));
        }
    }
}

//使用 Runnable 方式
class  SellTicket02 implements Runnable{
    private int ticketnum =100;//让多个线程共享 ticketnum
    @Override
    public void run() {
        while (true){
            if (ticketnum <= 0) {
                System.out.println("售票结束。。。");
                break;
            }
            //休眠 50 ms
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 "+Thread.currentThread().getName() +" 售出一张票 "+
                    "剩余票数="+(--ticketnum));
        }
    }
}