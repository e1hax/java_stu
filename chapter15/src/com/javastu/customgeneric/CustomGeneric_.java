package com.javastu.customgeneric;

public class CustomGeneric_ {
}

// 1, Tiger 后面泛型，所以把Tiger类称为自定义泛型类
// 2，T,R,M 泛型的标识符，一般为单个大写字母
// 3, 泛型标识符可以有多个
// 4，普通成员可以使用泛型 （属性，方法）
class Tiger<T,R,M>{
    String name;
    R r;
    M m;
    T t;

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}