package com.stu.homework;

public class Homework04 {
    public static void main(String[] args) {
        A a = new A();
        a.a1();

    }
}

class A{
    private  String NAME = "Tom";
    public void a1(){
        class B{
            private  final String NAME = "Jack";
            public void show(){
                //如果内部类与外部类的属性重名，可以用  类名.this.属性名访问
                System.out.println("NAME:"+NAME+"\n外部类："+A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }

}