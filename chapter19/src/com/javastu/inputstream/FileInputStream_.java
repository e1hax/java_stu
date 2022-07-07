package com.javastu.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by e1hax on 2022/7/7.
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     *  读取文件内容
     */
    @Test
    public void readFile01(){
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream =null;
        try {
            //创建 FileInputStream 对象 用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read())!=-1){
                System.out.print((char)readData);//转换成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 使用 read(byte[] b) 读取文件内容
     */
    @Test
    public void readFile02(){
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\hello.txt";
        //字节数组
        byte[] buf = new byte[8];//一次读八个字节
        int readLen =0;
        FileInputStream fileInputStream =null;
        try {
            //创建 FileInputStream 对象 用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多b.length字节的数据到字节数组。
            //如果返回-1，表示读取完毕
            //如果读取完毕，返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));//转换成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
