package com.javastu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Created by e1hax on 2022/7/7.
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    // 判断 news2.txt 是否存在，如果存在就删除
    @Test
    public void  m1(){
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\news2.txt";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println(file.getName()+"删除成功");
            }else{
                System.out.println(file.getName()+"删除失败");
            }
        }else{
            System.out.println("文件不存在");
        }
    }

    // 判断 demo02 是否存在，如果存在就删除
    //在java编程中，目录也被当做文件
    @Test
    public void  m2(){
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\demo02";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println(file.getName()+"删除成功");
            }else{
                System.out.println(file.getName()+"删除失败");
            }
        }else{
            System.out.println("该目录不存在");
        }
    }

    // 判断D:\User\Desktop\hsp java\fileout\demo02\a\b 目录是否存在，如果存在返回已存在，否则创建目录
    @Test
    public void  m3(){
        String directoryPath = "D:\\User\\Desktop\\hsp java\\fileout\\demo02\\a\\b";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath+"已存在。。");
        }else{
            if (file.mkdirs()) {
                System.out.println(directoryPath+"创建成功");
            }else{
                System.out.println(directoryPath+"创建失败");
            }
        }
    }
}
