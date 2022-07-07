package com.javastu.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by e1hax on 2022/7/7.
 */
public class FileReader_ {
    public static void main(String[] args) {

    }
    /**
     * 单个字符 读取文件
     */
    public void readFile01(){
        //创建 FileReader 对象
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\story.txt";
        FileReader fileReader = null;
        int data = 0 ;
        try {
            fileReader = new FileReader(filePath);
            //循环读取，使用read，单个字符读取
            while ((data = fileReader.read())!=-1){
                //打印，强转为char
                System.out.print((char)data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用字符数组读取文件
     */
    @Test
    public void readFile02(){
        //创建 FileReader 对象
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\story.txt";
        FileReader fileReader = null;
        int readLen = 0 ;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            //循环读取  使用 read(buf)  返回的是实际读取到的字符数
            //如果返回 -1，说明到文件结束
            while ((readLen = fileReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
