package com.javastu.tankgame4;

import java.util.Vector;

/**
 * Created by e1hax on 2022/7/4.
 * 敌人的坦克
 */
public class Enemy extends Tank implements Runnable{
    //定义一个Shot对象,表示一个射击(线程)
    Shot shot=null;
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    public Enemy(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true){
            //判断集合 shots size()=0  创建一颗子弹
            if (isLive&&shots.size()==0){
                Shot s =null;
                //判断坦克的方向，创建对应的子弹
                switch (getDirect()){
                    case 0:
                        s = new Shot(getX()+20,getY(),0 );
                        break;
                    case 1://右
                        s = new Shot(getX()+50,getY()+20,1 );
                        break;
                    case 2://下
                        s = new Shot(getX()+20,getY()+50,2 );
                        break;
                    case 3://左
                        s = new Shot(getX(),getY()+20,3 );
                        break;
                }
                shots.add(s);
                //启动
                new Thread(s).start();
            }

            //根据坦克的方向来继续移动
            switch (getDirect()){
                case 0:
                    for (int i = 0; i < 100+(int)(Math.random()*100); i++) {
                        if (getY()>0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 100+(int)(Math.random()*100); i++) {
                        if (getX()+50<1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i <100+(int)(Math.random()*100); i++) {
                        if (getY()+50<750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < 100+(int)(Math.random()*100); i++) {
                        if (getX()>0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

            }



            // 随机设置一个方向
            setDirect((int)(Math.random()*4));

            //一定要考虑什么时候线程结束
            if (isLive == false) {
                break;
            }
        }
    }
}
