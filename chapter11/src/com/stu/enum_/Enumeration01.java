package com.stu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
    }
}


//演示自定义枚举实现

class Season{
    private  String name;
    private String desc;

    //定义了四个对象
    public static final Season SPRING = new Season("春天","温暖");
    public static final Season WINTER = new Season("冬天","寒冷");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season SUMMER = new Season("夏天","炎热");

    //1.构造器私有化，防止直接new
    //2.去掉set方法，防止属性被修改
    //3.在season内部，直接创建固定对象
    //4.优化：可以再加入一个final修饰符
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDisc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", disc='" + desc + '\'' +
                '}';
    }
}
