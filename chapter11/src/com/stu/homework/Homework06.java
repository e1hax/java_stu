package com.stu.homework;

public class Homework06 {
    public static void main(String[] args) {
        Car car = new Car(41);
        Car car2 = new Car(30);
        Car car3= new Car(-20);
        car.getAir().flow();
        car2.getAir().flow();
        car3.getAir().flow();

    }
}

class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature>40) System.out.println("空调开启,冷风模式");
            else if(temperature<0)  System.out.println("空调开启,暖风模式");
            else System.out.println("空调关闭");
        }
    }

    //提供一个返回 Air 对象的方法
    public Air getAir(){
        return  new Air();
    }

}
