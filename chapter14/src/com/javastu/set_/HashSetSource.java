package com.javastu.set_;

import java.util.HashSet;

public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("go");
        hashSet.add("python");
        hashSet.add("java");
        System.out.println("set="+hashSet);

        /*
        HashSet源码解析
        1.执行一个构造器
                public HashSet() {
                    map = new HashMap<>();
                }
        2.执行 add()
                public boolean add(E e) {
                    return map.put(e, PRESENT)==null;
                    // PRESENT 为 private static final Object PRESENT = new Object();
                }
        3.执行 put() ,该方法会执行 hash(key) 方法 得到对应的 hash 值  算法 (h = key.hashCode()) ^ (h >>> 16)
                public V put(K key, V value) {//key=java   value=PRESENT
                    return putVal(hash(key), key, value, false, true);
                }
        4. 执行putVal()
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                           boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i; //定义了辅助变量
                // table 就是 HashMap 的一个数组，类型是 Node[]
                // if 语句 表示如果当前 table 是null 或者大于 0，就是第一次扩容，到16个空间
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                //(1)根据传入的 key，得到的 hash值去计算该key应该存放到 table表的哪个索引位置，并且把这个位置的对象赋值给辅助变量p
                //(2)判断p 是否为null
                //(2.1) 如果p 为 null，表示还没有存放元素，就创建一个Node (key="java",value=PRESENT)
                //(2.2) 就放在该位置  tab[i] = newNode(hash, key, value, null);
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                // 开发提示：在需要局部变量(辅助变量)的时候，再创建
                    Node<K,V> e; K k; //辅助变量
                    //如果当前索引位置对应的链表的第一个元素和准备添加的key 的hash一样
                    //并且满足 下面两个条件之一：
                    //  (1)准备加入的 key 和 p指向的Node节点的key是同一个对象
                    //  (2)p指向的Node节点的key 的 equals() 和准备加入的 key 比较后相同
                    //就不能加入
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    //在判断 p 是不是一颗红黑树
                    //如果是一颗红黑树，就调用 putTreeVal，来进行添加
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {//如果 table 对应索引的位置，已经是一个链表，就是用for循环比较
                          // (1)依次和该链表的每一个元素比较后，都不相同，则加入到该链表的最后
                          //   注意 在把元素添加到链表后，立即判断该链表是否已经达到八个结点，
                          //   就调用 treeifyBin() 对当前这个链表进行树化(转成红黑树)
                          //   注意 在转成红黑树时，要进行判断，判断条件如下
                          //       if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                          //             resize();
                          //  如果上面条件条件成立，先将 table 扩容
                          //  只有上面条件不成立时，才进行转成红黑树
                          // (2)依次和该链表的每一个元素比较过程中，如果有相同的情况，就直接 break
                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) {
                                p.next = newNode(hash, key, value, null);
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                if (++size > threshold)
                    resize();
                afterNodeInsertion(evict);
                return null;
            }
         */
    }
}
