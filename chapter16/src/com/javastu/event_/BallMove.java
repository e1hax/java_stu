package com.javastu.event_;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by e1hax on 2022/7/3.
 * 小球通过键盘控制上下左右移动 -> java事件控制
 */
public class BallMove extends JFrame{
    private MyPanel mp =null;
    public static void main(String[] args) {
        new BallMove();
    }

    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setVisible(true);
        //窗口JFrame 键盘键盘事件 即可以监听到面板上发生的 键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
//KeyListener :监听器，监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    //为了小球可以移动，把小球左上角坐标设置为变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    //有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //某个键按下，该方法就会触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode()+"  被按下");
        //根据用户按下的不同键，来控制小球移动
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y+=2;

        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y-=2;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x+=2;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x-=2;
        }
        this.repaint();
    }


    //某个键按下释放(松开)，该方法就会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
