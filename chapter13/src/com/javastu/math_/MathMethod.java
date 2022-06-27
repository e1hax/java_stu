package com.javastu.math_;

public class MathMethod {
    public static void main(String[] args){
        //查看Math常用的方法(静态方法)
        // 1.abs的绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);
        // 2.pow 求幂
        double pow = Math.pow(2,4);
        System.out.println(pow);
        // 3.ceil 向上取整，返回>=该参数的最小整数
        double ceil = Math.ceil(-3.00001);
        System.out.println(ceil);
        // 4.floor向下取整，返回<=该参数的最大整数
        double floor=Math.floor(-4.999);
        System.out.println(floor);
        // 5.round 四舍五入 Math.floor(改参数+0.5)
        double round = Math.round(-5.001);
        System.out.println(round);
        // 6.sqrt 求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);

        // 7. random 求随机数
        // random 返回的是一个 0 <= x < 1 之间的随机小数
        // a-b之间的一个随机整数，a,b均为整数？  a=2  b=7
        // 返回一个 2 <= x <= 7
        // Math.random()*(b-a) 返回的就是 0 <= x <= b-a
        // (1) (int)(a) <= x <= (int)(a+Math.random()*(b-a+1))
        // (2) (int)(a+Math.random()*(b-a+1))  =  (int)(2+Math.random()*6)
        //    Math.random()*6 返回的是一个  0 <= x <6 小数
        //    2+Math.random()*6 返回的就是  2 <= x <8 小数
        //  (int)(2+Math.random()*6)      2 <= x <=7
        int a=2,b=7;
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*(b-a+1)+a));
        }

        // 8.MAX  MIN 返回最大值最小值
        System.out.println("MAX="+Math.max(2,9));
        System.out.println("MIN="+Math.min(2,9));

    }
}
