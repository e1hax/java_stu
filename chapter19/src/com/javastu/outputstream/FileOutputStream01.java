package com.javastu.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by e1hax on 2022/7/7.
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    /**
     * 用 FileOutputStream 将数据写到文件中
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void write(){
        //创建 FileOutputStream 对象
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\hi.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //1. new FileOutputStream(filePath); 创建方式，当写入内容时，会覆盖原来的内容
            //1. new FileOutputStream(filePath，true); 创建方式，当写入内容时，会追加到原来内容后面
            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
//            fileOutputStream.write("H");
            //写入一个字符串
            String str = "hello world";
            // str.getBytes()   可以把 字符串 -> 字节数组
            fileOutputStream.write(str.getBytes());
            //write(byte[] b,int off,int len 将 len 字节从位于偏移量 off的指定字节数组写入此文件输出流;
//            fileOutputStream.write(str.getBytes(),0,5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
