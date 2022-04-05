package com.stu.homework;

public class Homework07 {
    public static void main(String[] args) {
        Color color = Color.YELLOW;
        //在 Switch() 中直接放入 枚举对象
    switch (color){
        case GREEN:
            color.show();
            System.out.println("匹配到绿色");
            break;
        case YELLOW:
            color.show();
            System.out.println("匹配到黄色");
            break;
        case BLACK:
            color.show();
            System.out.println("匹配到黑色");
            break;
        case BLUE:
            color.show();
            System.out.println("匹配到蓝色");
            break;
        case RED:
            color.show();
            System.out.println("匹配到红色");
            break;
        default:
            System.out.println("没有匹配到");
    }

    }
}

enum Color implements ImyInterface{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为:"+redValue+","+greenValue+","+blueValue);
    }
}

interface ImyInterface{
    public  void show ();
}
