package com.javastu.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by e1hax on 2022/7/7.
 */
public class FileCopy {
    public static void main(String[] args) {
        //1. 创建文件输入流，读取文件数据到程序
        //2. 创建文件输出流，将读取到的文件数据，写入到指定文件
        String srcFilePath = "D:\\User\\Desktop\\hsp java\\fileout\\wallhaven.jpg";
        String destFilePath = "D:\\User\\Desktop\\hsp java\\fileout\\img\\wallhaven.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字符数组，提高读取效率
            byte[] buf = new byte[1024];
            //
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf))!=-1){
                //读取到后，就写入到文件 通过 fileOutputStream
                //边读边写
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入流 和 输出流  释放资源
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
