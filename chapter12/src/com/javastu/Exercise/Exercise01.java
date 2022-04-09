package com.javastu.Exercise;

public class Exercise01 {
    public static void main(String[] args) {
        //args 参数可以通过 Edit Configuration 里面 Program arguments 来传入

        try {
            if (args.length!=2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对"); //自定义异常
            }
            //把接收到的参数转换为整数，可能输入的不是整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            //调用 cal 方法，可能出现算术异常
            double res = cal(n1,n2);
            System.out.println("计算结果为："+res);
            //捕获自定义异常
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            //
        }catch (NumberFormatException e){
            System.out.println("参数格式不对，需要输入整数");
        }catch (ArithmeticException e){
            System.out.println("出现除0的情况");
        }
    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}
