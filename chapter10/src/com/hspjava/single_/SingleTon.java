package com.hspjava.single_;

public class SingleTon {
    public static void main(String[] args) {
        Friend friend1 = Friend.getInstance();
        System.out.println(friend1);

    }
}

class Friend{
    private String name;
    //当Friend的类被调用后， 静态属性被加载
    private static Friend friend =  new Friend("小恒");

    private Friend(String name) {
        this.name = name;
    }

    public static Friend getInstance(){
        return friend;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}
