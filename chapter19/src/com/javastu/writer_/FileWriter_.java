package com.javastu.writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by e1hax on 2022/7/7.
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "D:\\User\\Desktop\\hsp java\\fileout\\note.txt";
        //创建 一个 FileWriter对象
        FileWriter fileWriter = null;
        char[] chars= {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            //字符串写入
            fileWriter.write("H");
            //char数组写入
            fileWriter.write(chars);
            //写入指定数组的指定部分
            fileWriter.write("hello,world".toCharArray(),0,5);
            //写入整个字符串
            fileWriter.write("你好 北京");
            //写入字符串的指定部分
            fileWriter.write("上海天津",0,2);

            //在数据量大的情况下，可以使用循环操作
            fileWriter.write("风雨之后，定见彩虹");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter != null) {
                /*
                close 源码追踪
                private void writeBytes() throws IOException {
                    bb.flip();
                    int lim = bb.limit();
                    int pos = bb.position();
                    assert (pos <= lim);
                    int rem = (pos <= lim ? lim - pos : 0);

                        if (rem > 0) {
                    if (ch != null) {
                        if (ch.write(bb) != rem)
                            assert false : rem;
                    } else {
                        out.write(bb.array(), bb.arrayOffset() + pos, rem);
                    }
                    }
                    bb.clear();
                    }
                 */
                try {
//                    fileWriter.flush();
                    //关闭文件流，等价于 flush()+关闭
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("程序结束");
        }
    }
}
