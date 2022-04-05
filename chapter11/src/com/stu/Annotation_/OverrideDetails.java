package com.stu.Annotation_;

public class OverrideDetails {
}


class Father{
    public void fly(){
        System.out.println("Father fly...");
    }
}

class Son extends Father{
    /**
     * 1. @Override 注解放在 fly 方法上，表示子类重写了 父类的 fly方法
     * 2. 如果没有写 @Override  还是重写了父类的fly方法
     * 3.如果写了 @Override 注解，编译器就回去检查该方法是否真的重写了父类的方法，如果
     * 的确重写了，则编译通过，如果没有构成重写，则编译错误
     */
    @Override
    public void fly() {
        super.fly();
    }
}