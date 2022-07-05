package com.javastu.method_;

/**
 * Created by e1hax on 2022/7/5.
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws Exception{
        T t = new T();
        t.setName("JACK");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        // 主线程打印 5 个 hi ，就中断子线程休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(" hi "+ i);
        }

        System.out.println(t.getName()+" `线程的优先级 = "+t.getPriority());

        t.interrupt();// 当执行到这里，就会中断子线程休眠
    }
}


class T extends  Thread{
    @Override
    public void run() {
        while (true){
        for (int i = 0; i < 100; i++) {
            //Thread.currentThread().getName() 获取当前线程名称
            System.out.println(Thread.currentThread().getName()+"吃饱了~~~"+i);
        }
        try {
            System.out.println(Thread.currentThread().getName()+"休眠中~~~");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // 当该线程到一个 interrupt 方法时，就会catch 到一个异常，可以加入自己的业务代码
            // InterruptedException 捕获到一个中断异常
            System.out.println(Thread.currentThread().getName() + "被 interrupt 了");
        }}
    }
}

