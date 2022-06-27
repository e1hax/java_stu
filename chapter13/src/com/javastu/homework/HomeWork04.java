package com.javastu.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        String s = "HJASHFD56753647365JLAHDSFJGsddsafzn12315436xhfhjfa";
        count(s);
    }

    /**
     * 输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字
     * 思路分析
     * 1. 遍历字符串 ，如果char 在'0' ~'9'
     * 2.
     */

    public static void count(String str){
        if (str == null) {
            System.out.println("不能为空");
        }
        char[] chars = str.toCharArray();
        int cntNum=0,cntUpper=0,cntLower=0,cntOther=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >='0' && chars[i]<='9') {
                cntNum++;
            }else if (chars[i] >='a' && chars[i]<='z'){
                cntLower++;
            }else if (chars[i] >='A' && chars[i]<='Z'){
                cntUpper++;
            }else{
                cntOther++;
            }
        }
        System.out.println("大写字母："+cntUpper+",小写字母"+cntLower+",数字："+cntNum+"，其它："+cntOther);
    }


}
