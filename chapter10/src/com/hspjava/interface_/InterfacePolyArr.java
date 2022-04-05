package com.hspjava.interface_;

/**
 * 接口的动态绑定机制
 */

public class InterfacePolyArr {
    public static void main(String[] args) {
//        创建一个多态数组
        usb usbs[] = new usb[2];
        usbs[0]=new Phone();
        usbs[1]=new Camera();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定机制
//           如果usbs[i]的运行类型是Phone的话，向下转型，调用phone特有的方法 call（）
            if (usbs[i] instanceof Phone){
                ((Phone) usbs[i]).call();
            }
        }
    }
}


interface usb{
    void work();
}
class Phone implements usb{
    @Override
    public void work() {
        System.out.println("手机工作中。。。");
    }
    void call(){
        System.out.println("手机正在打电话。。。");
    }
}
class Camera implements usb{
    @Override
    public void work() {
        System.out.println("相机工作中。。。");
    }
}