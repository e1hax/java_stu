package com.javastu.tankgame4;

/**
 * Created by e1hax on 2022/7/6.
 */
public class Shot implements Runnable{
     int x;//子弹X坐标
     int y;//子弹Y坐标
     int direct = 0;//子弹的方向
     int speed = 5;//子弹的速度
     boolean isLive = true; //子弹是否存活

    public Shot(int x, int y, int direct  ) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true){
            try {
                //线程休眠
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //根据方向来改变 x,y坐标
            switch (direct){
                case 0://上
                    y-=speed;
                    break;
                case 1://右
                    x+=speed;
                    break;
                case 2://下
                    y+=speed;
                    break;
                case 3://左
                    x-=speed;
                    break;
            }

            //测试输出 子弹的x,y坐标
            System.out.println("子弹x,y"+x+y);
            //如果子弹移动到面板边界，子弹就消失
            //当子弹碰到敌人坦克时，也应该结束线程
            if (!(x>=0&&x<=1000 && y>=0 && y<=750 && isLive)){
                isLive =false;
                break;
            }
        }
    }
}
