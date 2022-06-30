package com.javastu.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","jack");
        map.put("no2","tom");

        // 1. k-v 最后是存放在 HashMap$Node   tab[i] = newNode(hash, key, value, null);
        // 2. k-v 为了方便程序员的遍历，还会创建EntrySet集合，该集合存放的元素的类型 Entry，而一个Entry对象就有 k,v
        //      EntraySet<Entray<K,V>> 即：transient Set <Map.Entray<K,V>> entrySet;
        // 3. entrySet 中，定义类型是 Map.Entry，但实际上存放的还是 HashMap$Node,
        //      这是因为  static class Node<K,V> implements Map.Entry<K,V>
        // 4. 当把 HashMap$Node 对象存放到 entrySet 就方便我们的遍历，因为Map.Entry提供了重要方法 K.getKey(); V.getValue();

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj :set) {
//            System.out.println(obj.getClass());
            //为了从 HashMap$Node 取出 k-v
            //1.先做一个向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
