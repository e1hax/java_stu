package com.javastu.tankgame3;

import javax.swing.*;

public class TankGame03 extends JFrame{
    private MyPanel mp = null;
    public static void main(String[] args) {
        TankGame03 tankGame02 = new TankGame03();
    }

    public TankGame03( ) {
        mp = new MyPanel();
        //将mp放入 Thread 启动
        new Thread(mp).start();
        //将画板添加到窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(1000,750);
        //设置窗口可见
        this.setVisible(true);
        //点击窗口 结束程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //添加监听器到窗口
        this.addKeyListener(mp);

    }
}


