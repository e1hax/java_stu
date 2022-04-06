package com.javastu.try_;

public class TryCatchDetail02 {
    public static void main(String[] args) {
        //1.如果try代码块可能有多个异常
        //2.可以同时使用多个catch，捕获多个异常
        //3.子类异常要求写在前面，父类异常写在后面
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;
            System.out.println(res);
        }catch (NullPointerException e) {
            System.out.println("空指针异常："+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("算术异常："+e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally代码块被执行。");
        }
        System.out.println("程序继续执行。。。");

    }
}

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}