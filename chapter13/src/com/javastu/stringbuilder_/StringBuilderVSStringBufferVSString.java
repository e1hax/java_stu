package com.javastu.stringbuilder_;

public class StringBuilderVSStringBufferVSString {
    public static void main(String[] args) {
        String text = "";
        long stratTime =0L;
        long endTime =0L;

        System.out.println("1".equals(text));

        //StringBuffer的执行时间
        StringBuffer buffer = new StringBuffer("");
        stratTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime =System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间"+(endTime-stratTime));


//        StringBuilder的执行时间
        StringBuilder builder = new StringBuilder("");
        stratTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime =System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间"+(endTime-stratTime));




//        String的执行时间
        stratTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text+i;
        }
        endTime =System.currentTimeMillis();
        System.out.println("String的执行时间"+(endTime-stratTime));
    }
}
