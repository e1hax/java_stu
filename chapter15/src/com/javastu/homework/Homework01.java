package com.javastu.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework01 {
    public static void main(String[] args) {
        /*
        定义个泛型类DAO<T>,在其中定义一个Map成员变量，Map的键为String类型，值为T类型。
        分别创建以下方法:
        (1) public void save(String id,T entity):保存T类型的对象到Map成员变量中
        (2) public T get(String id):从map中获取id对应的对象
        (3) public void update(String id,T entity):替换map中key为id的内容，改为entity对象
        (4) public List<T> list(): 返回map中存放的所有T对象
        (5) public void delete(String id):删除指定id对象
        定义一个User类:
        该类包含: private成员变量 (int类型) id, age; (String 类型) name.
        创建DAO类的对象，分别调用其 save、get、 update、 list、 delete 方法来操作User对象，
        使用Junit单元测试类进行测试。
         */
        DAO<User> userDAO = new DAO<>();

        userDAO.save("001",new User(1,12,"jack"));
        userDAO.save("002",new User(2,14,"tom"));
        userDAO.save("003",new User(3,17,"tom"));

        System.out.println(userDAO.list());

        userDAO.update("002",new User(4,15,"jason"));
        System.out.println(userDAO.list());

        userDAO.get("003");

        userDAO.delete("003");
        System.out.println(userDAO.list());


    }
}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();


    @Test
    public void save(String id,T entity){
        map.put(id,entity);
    }

    @Test
    public T get(String id){
        return map.get(id) ;
    }

    @Test
    public void update(String id,T entity){
        map.put(id,entity);
    }

    //遍历map[K-V]
    @Test
    public List<T> list(){
        List<T> list = new ArrayList<>();

        //遍历
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(get(key));//使用本类的 get方法
        }
        return list;
    }

    @Test
    public void delete(String id){
        map.remove(id);
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
