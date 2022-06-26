package com.javastu.bignum_;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {

        //当需要处理很大的整数，long就不够用了
        BigInteger bigInteger = new BigInteger("277788884777778833399994777773");
        BigInteger bigInteger2 = new BigInteger("200");
        System.out.println(bigInteger);

        //1. 在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行 +-*/
        //2. 可以创建一个 要操作的 BigInteger 然后进行相应操作
        BigInteger add =  bigInteger.add(bigInteger2);// 加
        System.out.println(add);

        BigInteger mul =  bigInteger.multiply(bigInteger2); //乘
        System.out.println(mul);

        BigInteger sub =  bigInteger.subtract(bigInteger2); //减
        System.out.println(sub);

        BigInteger divide =  bigInteger.divide(bigInteger2); //除
        System.out.println(divide);

    }
}
