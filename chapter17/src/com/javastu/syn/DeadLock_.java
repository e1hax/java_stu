package com.javastu.syn;

/**
 * Created by e1hax on 2022/7/5.
 */
public class DeadLock_ {
    public static void main(String[] args) {
        //模拟死锁现象
        DeadLockDemo A = new DeadLockDemo(true);
        DeadLockDemo B = new DeadLockDemo(false);
        A.start();
        B.start();
    }
}

class DeadLockDemo extends  Thread{
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }
    // 下面业务逻辑分析
    // 1. 如果 flag 为 T ，线程就会先得到/持有 o1 对象锁，然后尝试获取 o2 对象锁
    // 2. 如果线程A 得不到 o2 对象锁，就会Blocked
    // 3. 如果 flag 为 F ，线程B 就会先得到/持有 o2 对象锁 ，然后尝试获取 o1 对象锁
    @Override
    public void run() {
        if (flag ) {
            // A线程
            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+" 进入1");
                synchronized (o2){// 这里获取 li 对象的监视权
                    System.out.println(Thread.currentThread().getName()+" 进入2");
                }
            }
        }else{
            // B线程
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+" 进入3");
                synchronized (o1){// 这里获取 li 对象的监视权
                    System.out.println(Thread.currentThread().getName()+" 进入4");
                }
            }
        }
    }
}
