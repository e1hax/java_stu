package com.javastu.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by e1hax on 2022/7/7.
 * 文件创建
 */
public class FileCreate {
    public static void main(String[] args) {

    }


    // 方式一： new File(String pathname)
    @Test
    public void create01(){
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //方式二：new File(File parent,String child) //根据父目录文件+子子路径构建
    @Test
    public void create02(){
        File parentFile = new File("D:\\User\\Desktop\\hsp java\\fileout\\");
        String fileName = "news2.txt";
        //这里的file对象，在java程序中只是一个对象
        //只有执行了createNewFile方法，才会真正的在磁盘创建该文件
        File file = new File(parentFile,fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent, String child) //根据父 日录+子路径构建
    @Test
    public void create03(){
        String parentPath = "D:\\User\\Desktop\\hsp java\\fileout\\";
        String fileName = "news3.txt";
        File file = new File(parentPath,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
