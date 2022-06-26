package com.javastu.homework;

public class HomeWord01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("交换前："+str);
        try {
            str = revers(str,1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
           return;
        }
        System.out.println("交换后："+str);
    }

    /**
     *   将字符串中指定部分进行反转。 比如将"abcdef" 反转为"aedcbf"
     * 思路分析
     * 1. 先定义方法
     * 2. 把 String 转成 char[]   char[] 的元素是可以交换的
     * 3. 画出示意图
     * 4. 代码实现
     */

    public static String revers(String str,int start,int end){
        if (!(str != null && start>=0 && end > start && end <str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start,j=end; i<j ; i++,j--) {
            temp = chars[i];
            chars[i]=chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}


