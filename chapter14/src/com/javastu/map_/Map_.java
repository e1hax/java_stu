package com.javastu.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        // Map接口实现类的特点
        //1. Map 与 Collection并列存在。用于保存具有印社关系的数据Key-Value(双列元素)
        //2. Map中的 Key 和 Value 可以是任何引用类型的数据，会封装到HashMap$Node 对象中
        //3. Map中的 Key 不允许重复，原因和HashSet 一样
        //4. Map中的 Value 可以重复
        //5. Map 的 Key 可以为null，value也可以为null，注意key为null，只能有一个，value为null，可以多个
        //6. 常用String类作为Map的Key
        //7. key和value之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value
        Map map = new HashMap();
        map.put("no1","jack");
        map.put("no2","tom");
        map.put("no1","jason"); //有相同的Key，就等价于替换
        map.put("no3","tom");
        map.put(null,"abc");
        map.put("no4",null);
//        map.put(null,null);
        map.put(new Object(),"金毛狮王");//key可以为任何对象
        System.out.println("map="+map);
        System.out.println(map.get("no2"));

    }
}
