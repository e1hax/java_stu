package com.javastu.ticket;

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

        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
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