package com.hspjava.interface_;

/**
 * 接口动态传递现象
 */

public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以直接指向实现了改接口的类的对象实例
        IG ig = new teacher();
        //接口 IG 继承了 IH， teacher 类相当于实现了 IH 接口
        IH ih = new teacher();

    }
}


interface IH{
    void work();
}
interface IG extends  IH{}
class teacher implements IG{
        //同样的，teacher也必须实现 IH 接口中的方法
    @Override
    public void work() {

    }
}
