package com.javastu.customgeneric;

public class CustomInterfaceGeneric_ {
    public static void main(String[] args) {

    }
}

//在继承接口或者实现接口时确定
interface IA extends IUsb<String,Double>{
}

interface  IUsb<U,R>{

    int n =10;

    //接口中，静态成员也不能使用泛型
    //U name;

    R get(U u);
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);

    default R method(U u){
        return null;
    }

}
