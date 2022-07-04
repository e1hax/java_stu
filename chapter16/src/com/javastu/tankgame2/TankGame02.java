package com.javastu.tankgame2;

import javax.swing.*;

public class TankGame02 extends JFrame{
    private MyPanel mp = null;
    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }

    public TankGame02( ) {
        mp = new MyPanel();
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


