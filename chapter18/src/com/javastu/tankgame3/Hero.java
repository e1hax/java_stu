package com.javastu.tankgame3;

//自己的坦克
public class Hero extends Tank {
    //定义一个Shot对象,表示一个射击(线程)
    Shot shot=null;
    public Hero(int x, int y) {
        super(x, y);
    }

    //射击
    public void shotEnemyTank(){
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

        //启动 shot 线程
        new Thread(shot).start();
    }
}
