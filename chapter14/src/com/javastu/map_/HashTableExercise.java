package com.javastu.map_;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("jhon",100);//OK
//        table.put(null,100);//异常 NullPointerException
//        table.put("jhon",null);//异常 NullPointerException
        table.put("lucy",100);//OK
        table.put("lic",100);//OK
        table.put("lic",88);//替换
        table.put("hello1",88);
        table.put("hello2",88);
        table.put("hello3",88);
        table.put("hello4",88);
        table.put("hello5",88);
        table.put("hello6",88);
        table.put("hello7",88);
        table.put("hello8",88);

        System.out.println(table);

        // 1. 底层有数组 Hashtable$Entry[] 初始化大小为 11
        // 2. 临界值 threshold  8 = 11*0.75
        // 3. 扩容：按照自己的扩容机制来即可
        // 4. 执行方法 addEntry(hash, key, value, index);  添加K-V 封装到Entry
        // 5. 当 if (count >= threshold) 满足时，就进行扩容
        // 5. 按照  int newCapacity = (oldCapacity << 1) + 1; 的大小进行扩容
    }
}
