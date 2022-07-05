package com.javastu.homework;

/**
 * Created by e1hax on 2022/7/5.
 */
public class HomeWork02 {
    public static void main(String[] args) {
        /*
        (1)有2个用户分别从同一个卡上取钱(总额: 10000)
        (2)每次都取1000,当余额不足时，就不能取款了
        (3)不能出现超取现象=》线程同步问题。
         */
        A a = new A();
        new Thread(a).start();
        new Thread(a).start();

    }
}

class A implements Runnable{
    private static int money=10000;

    @Override
    public void run() {
        while (true){
            //1. 这里使用 synchronized 实现了线程同步
            //2. 当多个线程执行到这里，就会去争夺 this 对象锁
            //3. 那个线程争夺到(获取)this对象锁，就执行 synchronized 代码块，执行完成后，就释放 this 对象锁
            //4. 争夺不到 this 对象锁，就 blocked，准备继续争夺
            //5. this 对象锁 是一个非公平锁
            synchronized (this){
                if (money==0){
                    System.out.println(Thread.currentThread().getName()+"取钱失败，余额不足 "+money);
                    break;
                }else{
                    System.out.println(Thread.currentThread().getName() + " 取出 1000 ，余额"+(money-=1000));
                }
            }
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}