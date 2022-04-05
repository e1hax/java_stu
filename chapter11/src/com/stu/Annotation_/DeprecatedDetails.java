package com.stu.Annotation_;

public class DeprecatedDetails {
}

/**
 * @Deprecated 修饰某个元素，表示该元素已经过时
 * 即不再推荐使用，但是任然可以使用
 * 可以修饰方法，类包，参数等等
 * @Deprecated 可以做新旧版本的兼容和过渡
 */
@Deprecated
class  A{
    public  void  hi(){
        System.out.println("Deprecated 使用");
    }
}