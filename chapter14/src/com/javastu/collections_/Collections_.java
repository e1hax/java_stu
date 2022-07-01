package com.javastu.collections_;

import java.util.*;

public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("smith");
        list.add("king");
        list.add("milan");
        //reverse(List) 反转 List 的元素顺序
        Collections.reverse(list);
        System.out.println("list=" + list);
        //shuffle(List)：对List 集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println("list=" + list);
        //sort(List)：根据元素的自然顺序 对指定List 集合元素按升序排序
        Collections.sort(list);
        System.out.println("list=" + list);
        //swap(List,int,int)：将指定List集合中的i处元素和j处元素进行交换
        Collections.swap(list,2,3);
        System.out.println("list=" + list);



//1) Object max(Collection):根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println(Collections.max(list));
//2) Object max(Collection, Comparator): 根据Comparator指定的顺序，返回给定集合中的最大元素
       Object maxObject =  Collections.max(list, new Comparator () {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length()-((String) o2).length();
            }
        });
        System.out.println("长度最大的元素="+maxObject);
//3) Object min(Collection)
        System.out.println(Collections.min(list));
//4) object min(Collection, Comparator)
        //参考第二个
//5) int frequency(Collection, Object): 返回指定集合中指定元素的出现次数
        System.out.println(Collections.frequency(list,"king"));
//6) void copy(List dest,List src):将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println("dest="+dest);
//7) boolean replaceAl(List list, Object oldVal, Object newVal):使用新值替换List对象的所有旧值
        Collections.replaceAll(list,"king","汤姆");
        System.out.println("list=" + list);
    }
}
