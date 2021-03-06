package com.javastu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Created by e1hax on 2022/7/7.
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
    public void info(){
        //getName、getAbsoLutePath、 getParent、 Length、 exists、 isFile、 isDirectory
        File file = new File("D:\\User\\Desktop\\hsp java\\fileout\\news1.txt");

        System.out.println("文件名= "+file.getName());
        System.out.println("文件绝对路径= "+file.getAbsolutePath());
        System.out.println("文件父级目录= "+file.getParent());
        System.out.println("文件大小(字节)= "+file.length());
        System.out.println("文件是否存在= "+file.exists());
        System.out.println("是不是一个文件= "+file.isFile());
        System.out.println("是不是一个目录= "+file.isDirectory());
    }
}
