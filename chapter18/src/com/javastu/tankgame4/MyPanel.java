package com.javastu.tankgame4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了监听键盘事件，实现KeyListener
//为了让Panel 不停地重绘子弹，需要将 MyPanel 实现 Runable，当做一个线程使用。
class MyPanel extends JPanel implements KeyListener,Runnable {
    //定义我的tank
    Hero hero = null;
    //定义敌方坦克
    Vector<Enemy> enemys = new Vector<>();
    //定义一个Vector，用于存放炸弹
    //说明：当子弹击中坦克师，加入一个Bomb对象到 bombs
    Vector<Bomb> bombs = new Vector<>();
    int enemySize = 3;

    //定义三张爆炸图片
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    //定义子弹
    Shot shot = null;

    public MyPanel(){
        hero = new Hero(600,100);//初始化自己的坦克
        hero.setSpeed(5);//设置坦克速度

        for (int i = 0; i < enemySize; i++) {
            Enemy enemy = new Enemy(100 * (i + 1), 0);
            enemy.setDirect(2);
            //启动线程
            new Thread(enemy).start();
            //给该enemyTank 加入一颗子弹
            Shot shot = new Shot(enemy.getX()+20,enemy.getY()+50,enemy.getDirect());
            //加入 enemy 的 Vector 成员n
            enemy.shots.add(shot);
            //启动 shot 对象
            new Thread(shot).start();
            enemys.add(enemy);
        }

        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_3.png"));

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);//初调用父类方法完成初始化
        //矩形
        g.fillRect(0,0,1000,750);//背景矩形 默认黑色


        //画自己的坦克-封装成方法
        if (hero.isLive == true) {
            drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);
        }


        for (Enemy enemy : enemys) {
            //判断敌人坦克是否存活
            if (enemy.isLive) {
                //存活才画敌人的坦克
                drawTank(enemy.getX(),enemy.getY(),g,enemy.getDirect(),1);
            }
            //画出enemy 所有子弹
            for (int i = 0; i < enemy.shots.size(); i++) {
                //取出子弹
                Shot shot = enemy.shots.get(i);
                //绘制子弹
                if (shot.isLive ) {// isLive== true
                    g.draw3DRect(shot.x, shot.y,3,3,false);
                }else {
                    //从Vector 删除
                    enemy.shots.remove(shot);
                }
            }


        }

        //画出hero射击的子弹
        g.setColor(Color.white);
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if ( shot!=null &&  shot.isLive == true) {
                    g.draw3DRect(shot.x,shot.y,3,3,false);
                }else{//该shot对象无效了，就从shots集合中拿掉
                    hero.shots.remove(shot);
                 }
        }

        //如果bombs 集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值去画对应的图片
            if (bomb.life>6){
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }else if(bomb.life>3){
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            }else{
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            }
            //让炸弹的生命值减少
            bomb.lifeDown();
            //如果bomb life为 0 就从 bombs 的集合中删除
            if (bomb .life==0) {
                bombs.remove(bomb);
            }
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

    public void hitEnemyTank(){
        //遍历hero的子弹
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
                //判断坦克是否被击中
            if (shot !=null && shot.isLive) {
                for (int j = 0; j < enemys.size(); j++) {
                    Enemy enemy = enemys.get(j);
                    hitTank(shot,enemy);
                }
            }
        }
    }

    public void hitHeroTank(){

        for (int j = 0; j < enemys.size(); j++) {
            Enemy enemy = enemys.get(j);
            //遍历enemy的子弹
            for (int i = 0; i <  enemy.shots.size(); i++) {
                Shot shot =  enemy.shots.get(i);
                //判断坦克是否被击中
                if (shot.isLive && hero.isLive) {
                    hitTank(shot,hero);
                }
            }
        }

    }



    //编写方法，判断我方的子弹是否击中敌人坦克.
    //什么时候判断我方的子弹是否击中敌人坦克   run方法
    public   void hitTank(Shot s ,Tank tank){
        //判断s 击中坦克
        switch (tank.getDirect()){
            case 0://敌人坦克向上
            case 2://敌人坦克向下
                if(s.x>tank.getX() && s.x< tank.getX()+40
                        && s.y> tank.getY() && s.y<tank.getY()+50){
                    s.isLive =false;
                    tank.isLive=false;
                    //将打掉的坦克从集合中移除
                    enemys.remove(tank);
                    //创建 Bomb 对象  加入到bombs集合
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if(s.x>tank.getX() && s.x< tank.getX()+50
                        && s.y> tank.getY() && s.y<tank.getY()+40){
                    s.isLive =false;
                    tank.isLive=false;
                    //将打掉的坦克从集合中移除
                    enemys.remove(tank);
                    //创建 Bomb 对象  加入到bombs集合
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    //处理WASD 键按下情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() ==  KeyEvent.VK_W) {//按下W键
            //改变坦克方向
            hero.setDirect(0);
            if (hero.getY()>=0) {
                hero.moveUp();
            }
        }else if (e.getKeyCode() ==  KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX()+50<1000) {
                hero.moveRight();
            }
        }else if (e.getKeyCode() ==  KeyEvent.VK_S) {

            hero.setDirect(2);
            if (hero.getY()+50<750) {
            hero.moveDown();}
        }else if (e.getKeyCode() ==  KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX()>0) {
            hero.moveLeft();}
        }

        //如果用户按下 J 就发射子弹
        if (e.getKeyCode() == KeyEvent.VK_J) {
            //发射一颗子弹
//            if (hero.shot == null||!hero.shot.isLive ) {
//                hero.shotEnemyTank();
//            }

            //发射多颗子弹
            hero.shotEnemyTank();

        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }



    @Override
    public void run() {//每隔100ms 重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hitHeroTank();
            hitEnemyTank();
            this.repaint();
        }
    }
}
