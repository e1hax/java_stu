package com.javastu.method_;

/**
 * Created by e1hax on 2022/7/5.
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws Exception{
        int count = 0;
        T1 t1 = new T1();
        t1.start();
        while (true){
            System.out.println("hi"+(++count));
            Thread.sleep(1000);
            if (count == 5){
                // t1 插队，知道t1子线程运行完成
//                t1.join();
                System.out.println("主线程 礼让 ~~~~~");
                Thread.yield(); //礼让  不一定成功
            }
            if (count == 20) {
                break;
            }
        }
    }
}

class T1 extends Thread{
    private  int count = 0 ;
    @Override
    public void run() {
        while (true){
            System.out.println("hello"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==20){
                break;
            }
        }
    }
}
