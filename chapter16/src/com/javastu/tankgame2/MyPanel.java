package com.javastu.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

class MyPanel extends JPanel implements KeyListener {
    //定义我的tank
    Hero hero = null;
    //定义敌方坦克
    Vector<Enemy> enemys = new Vector<>();
    int enemySize = 3;

    public MyPanel(){
        hero = new Hero(100,100);//初始化自己的坦克
        hero.setSpeed(5);//设置坦克速度

        for (int i = 0; i < enemySize; i++) {
            Enemy enemy = new Enemy(100 * (i + 1), 0);
            enemy.setDirect(2);
            enemys.add(enemy);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);//初调用父类方法完成初始化
        //矩形
        g.fillRect(0,0,1000,750);//背景矩形 默认黑色

        //画自己的坦克-封装成方法
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);

        //化敌人的坦克
        for (Enemy enemy : enemys) {
            drawTank(enemy.getX(),enemy.getY(),g,enemy.getDirect(),1);
        }

    }

    /**
     *
     * @param x 坦克的左上角 x坐标
     * @param y 坦克的左上角 y坐标
     * @param g 画笔
     * @param direct  坦克方向  上下左右
     * @param type  坦克类型
     */

    public void drawTank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            //根据不同类型坦克，设置不同颜色
            case 0://我方坦克
                g.setColor(Color.yellow);
                break;
            case 1://敌人坦克
                g.setColor(Color.CYAN);
                break;
        }
        //根据坦克方向，来绘制坦克
        //direct 表示方向(0:上 1：右 2：下 3：左)
        switch (direct){
            case 0:
                g.fill3DRect(x,y,10,50,false);//坦克左轮子
                g.fill3DRect(x+30,y,10,50,false);//坦克右轮子
                g.fill3DRect(x+10,y+10,20,30,false);//坦克中间矩形
                g.fillOval(x+10,y+15,20,20 );//坦克中间矩形
                g.drawLine(x+20,y+25,x+20,y );//坦克中间炮筒
                break;
            case 1:
                g.fill3DRect(x,y,50,10,false);//坦克左轮子
                g.fill3DRect(x,y+30,50,10,false);//坦克右轮子
                g.fill3DRect(x+10,y+10,30,20,false);//坦克中间矩形
                g.fillOval(x+15,y+10,20,20 );//坦克中间矩形
                g.drawLine(x+25,y+20,x+50,y+20 );//坦克中间炮筒
                break;
            case 2:
                g.fill3DRect(x,y,10,50,false);//坦克左轮子
                g.fill3DRect(x+30,y,10,50,false);//坦克右轮子
                g.fill3DRect(x+10,y+10,20,30,false);//坦克中间矩形
                g.fillOval(x+10,y+15,20,20 );//坦克中间矩形
                g.drawLine(x+20,y+25,x+20,y+50 );//坦克中间炮筒
                break;
            case 3:
                g.fill3DRect(x,y,50,10,false);//坦克左轮子
                g.fill3DRect(x,y+30,50,10,false);//坦克右轮子
                g.fill3DRect(x+10,y+10,30,20,false);//坦克中间矩形
                g.fillOval(x+15,y+10,20,20 );//坦克中间矩形
                g.drawLine(x+25,y+20,x,y+20 );//坦克中间炮筒
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理WASD 键按下情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() ==  KeyEvent.VK_W) {//按下W键
            //改变坦克方向
            hero.setDirect(0);
            hero.moveUp();
        }else if (e.getKeyCode() ==  KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        }else if (e.getKeyCode() ==  KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        }else if (e.getKeyCode() ==  KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
