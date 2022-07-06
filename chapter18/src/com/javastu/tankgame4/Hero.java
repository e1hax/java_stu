package com.javastu.tankgame4;

import java.util.Vector;

//自己的坦克
public class Hero extends Tank {
    //定义一个Shot对象,表示一个射击(线程)
    Shot shot=null;
    Vector<Shot> shots = new Vector<>();

    //可发射多个子弹
    public Hero(int x, int y) {
        super(x, y);
    }

    //射击
    public void shotEnemyTank(){
        if (shots.size() == 5) {
            return;
        }
        //创建Shot对象，根据当前Hero对象的位置和方向来创建Shot
        switch (getDirect()) {//得到坦克的方向
            case 0:
                shot = new Shot(getX()+20,getY(),0 );
                break;
            case 1://右
                shot = new Shot(getX()+50,getY()+20,1 );
                break;
            case 2://下
                shot = new Shot(getX()+20,getY()+50,2 );
                break;
            case 3://左
                shot = new Shot(getX(),getY()+20,3 );
                break;
        }

        //把新创建的shot 放入到集合
        shots.add(shot);
        //启动 shot 线程
        new Thread(shot).start();
    }
}
