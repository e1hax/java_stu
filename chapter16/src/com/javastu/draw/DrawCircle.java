package com.javastu.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){//构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口大小
        this.setSize(400,300);
        this.setVisible(true);
        // 当点击窗口 X 时，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//定义一个MyPanel，继承JPanel类，画图形，就在画板上
class MyPanel extends JPanel{
    // 1. MyPanel 对象就是一个画板
    // 2. Graphics g 把 g 理解成一支画笔
    // 3. Graphics 提供了很多绘图的方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
//        System.out.println("paint 方法被调用");
//        g.drawOval(10,10,100,100);

        //1.画直线drawLine(int x1,int y1,int x2,int y2)
//        g.drawLine(10,10,100,100);
        //2.画矩形边框drawRect(int x, int y, int width, int height)
//        g.drawRect(10,10,100,100);
        //3.画椭圆边框drawOval(int x, int y, int width, int height)

        //4.填充矩形fillRect(int x, int y, int width, int height)
            //设置画笔的颜色
//        g.setColor(Color.blue);
//        g.fillRect(10,10,100,100);
        //5.填充椭圆fillOval(int x, int y, int width, int height)
//        g.setColor(Color.red);
//        g.fillOval(10,10,100,100);
        //6.画图片drawlmage(Image img, int X, int y)
            //获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bg.png"));
//        g.drawImage(image,10,10,108,108,this);
        //7.画字符串drawString(String str, int x, int y)
            //设置画笔颜色
        g.setColor(Color.red);
            //设置字体
        g.setFont(new Font("微软雅黑",Font.BOLD,50));
            //画字符串
        g.drawString("北京",100,100);
        //8.设置画笔的字体setFont(Font font)
        //9.设置画笔的颜色setColor(Color c)

    }
}