package com.javastu.bignum_;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimal_ {
    public static void main(String[] args) {
        //当我们需要保存一个精度很高的数时，需要BigDecimal
        BigDecimal bigDecimal = new BigDecimal("1999.12311143453534532431241211135553434333");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        System.out.println(bigDecimal);

        //1. 在对 BigDecimal 进行加减乘除的时候，需要使用对应的方法，不能直接进行 +-*/
        //2. 可以创建一个 要操作的 BigDecimal 然后进行相应操作
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));

        //可能抛出 ArithmeticException 异常
        //在调用divide方法时，指定精度即可 BigDecimal.ROUND_CEILING
        //如果无限循环小数，就会保留 分子 的精度
        System.out.println(bigDecimal.divide(bigDecimal2,BigDecimal.ROUND_CEILING));


    }
}
