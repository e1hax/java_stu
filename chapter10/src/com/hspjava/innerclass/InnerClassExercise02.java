package com.hspjava.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床！！！");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课啦123！！！");
            }
        });

    }
}


interface Bell{
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){//传递的是接口类型的参数
        bell.ring();
    }
}