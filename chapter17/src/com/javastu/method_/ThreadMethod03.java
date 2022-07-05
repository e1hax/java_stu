package com.javastu.method_;

/**
 * Created by e1hax on 2022/7/5.
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws Exception{
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //如果 main主线程结束，子线程自动结束
        //只需要将子线程设置为守护线程
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 0; i < 10; i++) {// main 线程
            System.out.println("Mark 在辛苦工作~~");
            Thread.sleep(1000);
        }
    }

}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for ( ; ;  ) {//无限循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Jack 和 Mary 快乐聊天 ~~~~~");
        }
    }
}