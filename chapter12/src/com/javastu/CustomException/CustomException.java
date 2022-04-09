package com.javastu.CustomException;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        //要求范围在 18-120 之间，否则抛出异常
        if(!(age>=18 &&age<=120)){
            //通过构造器设置信息
            throw new AgeException("年龄范围应该在 18 -120 之间");
        }
        System.out.println("年龄输入正确");
    }

}

/**
 * 自定义一个异常
 * 1.一般情况下，我么自定义异常继承 RuntimeException
 * 2.即把自定义异常做成 运行时异常 ，好处是我们可以使用默认的处理机制
 * 3.即比较方便
 */
class AgeException extends RuntimeException{
    public AgeException(String message){

    }
}